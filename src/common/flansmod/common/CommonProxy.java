package flansmod.common;

import net.minecraft.src.*;

public abstract class CommonProxy
{
     public abstract void load();

     public abstract Object getClientGui(int ID, EntityPlayer player, World world, int x, int y, int z);

     public Container getServerGui(int ID, EntityPlayer player, World world, int x, int y, int z)
     {
          return null;
     }
     
     public abstract Object loadBulletModel(String[] split, String shortName);
     
     public abstract Object loadPlaneModel(String[] split, String shortName);
     
     public abstract Object loadMGModel(String[] split, String shortName);
     
     public abstract Object loadAAGunModel(String[] split, String shortName);
}