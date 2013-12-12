package co.uk.flansmods.common.guns;

import java.util.ArrayList;

import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.TypeFile;

public class AttachmentType extends InfoType implements IScope
{
	public static ArrayList<AttachmentType> attachments = new ArrayList<AttachmentType>();
	
	/** The type of attachment. Each gun can have one barrel, one scope, one grip, one stock and some number of generics up to a limit set by the gun */
	public EnumAttachmentType type = EnumAttachmentType.generic;
	
	/** This variable controls whether or not bullet sounds should be muffled */
	public boolean silencer = false;
	/** These stack between attachments and apply themselves to the gun's default spread */
	public float spreadMultiplier = 1F;
	
	//Scope variables
	/** The zoomLevel of this scope */
	
	public AttachmentType(TypeFile file) 
	{
		super(file);
		attachments.add(this);
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			
		}
		catch (Exception e)
		{
			System.out.println("Reading attachment file failed.");
			e.printStackTrace();
		}
	}

	public static AttachmentType getAttachment(String s)
	{
		for(AttachmentType attachment : attachments)
		{
			if(attachment.shortName.equals(s))
				return attachment;
		}
		return null;
	}

	@Override
	public float getZoomFactor() 
	{
		return 0;
	}

	@Override
	public boolean hasZoomOverlay() 
	{
		return false;
	}

	@Override
	public String getZoomOverlay() 
	{
		return null;
	}

	@Override
	public float getFOVFactor() {
		// TODO Auto-generated method stub
		return 0;
	}
}
