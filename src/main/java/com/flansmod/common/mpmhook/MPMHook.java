package com.flansmod.common.mpmhook;

import net.minecraft.entity.player.EntityPlayer;
import noppes.mpm.ModelData;
import noppes.mpm.Server;
import noppes.mpm.constants.EnumAnimation;
import noppes.mpm.constants.EnumPackets;

public class MPMHook {
	public static void processAnimation(EntityPlayer player, EnumAnimation animation) {
		ModelData data = ModelData.get(player);
		Server.sendAssociatedData(player, EnumPackets.ANIMATION, player.getUniqueID(), animation);
		data.setAnimation(animation);
	}
	public static EnumAnimation calcSleepingAnimation(EntityPlayer player) {
		EnumAnimation animation = EnumAnimation.SLEEPING_SOUTH;
		float rotation = player.rotationYaw;
		while(rotation < 0)
			rotation += 360;
		while(rotation > 360)
			rotation -= 360;
		int rotate = (int) ((rotation + 45) / 90);
		if(rotate == 1)
			animation = EnumAnimation.SLEEPING_WEST;
		if(rotate == 2)
			animation = EnumAnimation.SLEEPING_NORTH;
		if(rotate == 3)
			animation = EnumAnimation.SLEEPING_EAST;
		return animation;
	}
}
