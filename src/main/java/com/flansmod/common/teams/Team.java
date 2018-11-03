package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;

public class Team extends InfoType
{
	public static List<Team> teams = new ArrayList<>();
	public List<String> members = new ArrayList<>();
	//public List<ITeamBase> bases = new ArrayList<ITeamBase>();
	public List<PlayerClass> classes = new ArrayList<>();
	
	public static Team spectators;
	
	public int score = 0;
	
	public int teamColour = 0xffffff;
	public char textColour = 'f';
	
	public ItemStack hat;
	public ItemStack chest;
	public ItemStack legs;
	public ItemStack shoes;
	
	public Team(String s, String s1, int teamCol, char textCol)
	{
		super(new TypeFile("NoPack", EnumType.team, s, false));
		shortName = s;
		name = s1;
		teamColour = teamCol;
		textColour = textCol;
		teams.add(this);
	}
	
	public Team(TypeFile file)
	{
		super(file);
		teams.add(this);
	}
	
	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("TeamColour"))
			{
				teamColour = (Integer.parseInt(split[1]) << 16) + ((Integer.parseInt(split[2])) << 8) + ((Integer.parseInt(split[3])));
			}
			if(split[0].equals("TextColour"))
			{
				if(split[1].equals("Black"))
					textColour = '0';
				if(split[1].equals("Blue"))
					textColour = '1';
				if(split[1].equals("Green"))
					textColour = '2';
				if(split[1].equals("Aqua"))
					textColour = '3';
				if(split[1].equals("Red"))
					textColour = '4';
				if(split[1].equals("Purple"))
					textColour = '5';
				if(split[1].equals("Orange"))
					textColour = '6';
				if(split[1].equals("LGrey"))
					textColour = '7';
				if(split[1].equals("Grey"))
					textColour = '8';
				if(split[1].equals("LBlue"))
					textColour = '9';
				if(split[1].equals("LGreen"))
					textColour = 'a';
				if(split[1].equals("LAqua"))
					textColour = 'b';
				if(split[1].equals("Red"))
					textColour = 'c';
				if(split[1].equals("Pink"))
					textColour = 'd';
				if(split[1].equals("Yellow"))
					textColour = 'e';
				if(split[1].equals("White"))
					textColour = 'f';
			}
			if(split[0].equals("Hat") || split[0].equals("Helmet"))
			{
				if(split[1].equals("None"))
					return;
				for(Item item : FlansMod.armourItems)
				{
					ArmourType armour = ((ItemTeamArmour)item).type;
					if(armour != null && armour.shortName.equals(split[1]))
						hat = new ItemStack(item);
				}
			}
			if(split[0].equals("Chest") || split[0].equals("Top"))
			{
				if(split[1].equals("None"))
					return;
				for(Item item : FlansMod.armourItems)
				{
					ArmourType armour = ((ItemTeamArmour)item).type;
					if(armour != null && armour.shortName.equals(split[1]))
						chest = new ItemStack(item);
				}
			}
			if(split[0].equals("Legs") || split[0].equals("Bottom"))
			{
				if(split[1].equals("None"))
					return;
				for(Item item : FlansMod.armourItems)
				{
					ArmourType armour = ((ItemTeamArmour)item).type;
					if(armour != null && armour.shortName.equals(split[1]))
						legs = new ItemStack(item);
				}
			}
			if(split[0].equals("Shoes") || split[0].equals("Boots"))
			{
				if(split[1].equals("None"))
					return;
				for(Item item : FlansMod.armourItems)
				{
					ArmourType armour = ((ItemTeamArmour)item).type;
					if(armour != null && armour.shortName.equals(split[1]))
						shoes = new ItemStack(item);
				}
			}
			if(split[0].equals("AddDefaultClass") || split[0].equals("AddClass"))
			{
				classes.add(PlayerClass.getClass(split[1]));
			}
		}
		catch(Exception e)
		{
			FlansMod.log.error("Reading team file failed.");
			FlansMod.log.throwing(e);
		}
	}
	
	public static Team getTeam(String s)
	{
		for(Team team : teams)
		{
			if(team.shortName.equals(s))
				return team;
		}
		return null;
	}
	
	public static Team getTeam(int iHash)
	{
		for(Team team : teams)
		{
			if(team.shortName.hashCode() == iHash)
				return team;
		}
		return null;
	}
	
	/*
	//Called both by ops and the gametype
	public void addBase(ITeamBase base)
	{
		bases.add(base);
	}
	
	//Called both by ops and the gametype
	public void removeBase(ITeamBase base)
	{
		bases.remove(base);
	}
	*/
	
	public void removePlayer(EntityPlayer player)
	{
		removePlayer(player.getName());
	}
	
	public String removePlayer(String username)
	{
		members.remove(username);
		if(PlayerHandler.getPlayerData(username) != null)
			PlayerHandler.getPlayerData(username).team = null;
		return username;
	}
	
	public EntityPlayer addPlayer(EntityPlayer player)
	{
		addPlayer(player.getName());
		return player;
	}
	
	public String addPlayer(String username)
	{
		ArrayList<String> list = new ArrayList<>();
		list.add(username);
		for(Team team : teams)
		{
			team.members.removeAll(list);
		}
		members.add(username);
		PlayerHandler.getPlayerData(username).newTeam = PlayerHandler.getPlayerData(username).team = this;
		return username;
	}
	
	public String removeWorstPlayer()
	{
		sortPlayers();
		if(members.isEmpty())
			return null;
		else return removePlayer(members.get(members.size() - 1));
	}
	
	public void sortPlayers()
	{
		members.sort(new ComparatorScore());
	}
	
	public static class ComparatorScore implements Comparator<String>
	{
		@Override
		public int compare(String a, String b)
		{
			PlayerData dataA = PlayerHandler.getPlayerData(a);
			PlayerData dataB = PlayerHandler.getPlayerData(b);
			if(dataA == null || dataB == null)
				return 0;
			return dataB.score - dataA.score;
		}
		
	}
	
	@Override
	protected void preRead(TypeFile file)
	{
	}
	
	@Override
	protected void postRead(TypeFile file)
	{
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel()
	{
		return null;
	}
}
