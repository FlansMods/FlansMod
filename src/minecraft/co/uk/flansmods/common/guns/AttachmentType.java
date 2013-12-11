package co.uk.flansmods.common.guns;

import java.util.ArrayList;

import co.uk.flansmods.common.InfoType;
import co.uk.flansmods.common.TypeFile;

public class AttachmentType extends InfoType 
{
	public static ArrayList<AttachmentType> attachments = new ArrayList<AttachmentType>();
	
	/** If a gun has a silencer attachment, then all shoot sounds will be muffled */
	public boolean silencer = false;
	/** These stack between attachments and apply themselves to the gun's default spread */
	public float spreadMultiplier = 1F;
	
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
}
