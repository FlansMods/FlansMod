package com.flansmod.common.network;

import com.flansmod.common.guns.GunType;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

import com.flansmod.common.guns.ItemGun;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketGunSpread extends PacketBase
{
    private float spread = 0F;

    //Default Constructor
    public PacketGunSpread()
    {}

    public PacketGunSpread(ItemStack stack, float amount)
    {
        if(stack != null && stack.getItem() instanceof ItemGun)
            spread = amount;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data)
    {
        data.writeFloat(spread);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data)
    {
        spread = data.readFloat();
    }

    @Override
    public void handleServerSide(EntityPlayerMP player)
    {
        ItemStack stack = player.inventory.getCurrentItem();
        if(stack != null && stack.getItem() instanceof ItemGun)
        {
            GunType type = ((ItemGun)stack.getItem()).type;

            if(type.getGrip(stack) != null && type.getSecondaryFire(stack))
                ((ItemGun)stack.getItem()).type.getGrip(stack).secondarySpread = spread;
            else
                ((ItemGun)stack.getItem()).type.bulletSpread = spread;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer client)
    {
//        ItemStack stack = client.inventory.getCurrentItem();
//        if(stack != null && stack.getItem() instanceof ItemGun)
//            ((ItemGun)stack.getItem()).type.bulletSpread = spread;
    }
}
