package co.uk.flansmods.common.driveables.mechas;

import java.util.ArrayList;

import co.uk.flansmods.client.model.ModelMechaTool;
import co.uk.flansmods.common.FlansMod;
import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.TypeFile;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MechaToolType extends InfoType 
{
	public static ArrayList<MechaToolType> types = new ArrayList<MechaToolType>();
	
	/** What type of tool is this? Axe? Pick? */
	public EnumMechaToolType function = EnumMechaToolType.sword;
	/** How quickly this tool works */
	public float speed = 1F;
	/** The maximum block hardness you can break with this tool */
	public float toolHardness = 1F;
	/** The model */
	@SideOnly(Side.CLIENT)
	public ModelMechaTool model;
	
	public MechaToolType(TypeFile file) 
	{
		super(file);
	}
	
    @Override
	protected void read(String[] split, TypeFile file)
    {
		super.read(split, file);
		try
		{
			if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelMechaTool.class);
			if(split[0].equals("Texture"))
				texture = split[1];
			if(split[0].equals("ToolType"))
				function = EnumMechaToolType.getToolType(split[1]);
			if(split[0].equals("Speed"))
				speed = Float.parseFloat(split[1]);
			if(split[0].equals("ToolHardness"))
				toolHardness = Float.parseFloat(split[1]);
		}
		catch (Exception e)
		{
		}
    }
	
	public static MechaToolType getTool(String find)
	{
		for(MechaToolType type : types)
		{
			if(type.shortName.equals(find))
				return type;
		}
		return null;
	}

}
