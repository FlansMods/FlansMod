package co.uk.flansmods.common.teams;

import co.uk.flansmods.common.network.PacketTeamSelect;
import cpw.mods.fml.common.network.PacketDispatcher;
import net.minecraft.src.DamageSource;
import net.minecraft.src.EntityPlayerMP;
import net.minecraft.src.Vec3;

public class GametypeTDM extends Gametype {

	public GametypeTDM() 
	{
		super("Team Deathmatch", "TDM", 2);
	}

	@Override
	public void initGametype() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startNewRound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopGametype() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerJoined(EntityPlayerMP player) 
	{
		sendTeamsMenuToPlayer(player);
	}

	@Override
	public void playerQuit(EntityPlayerMP player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean playerAttacked(EntityPlayerMP player, DamageSource source) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void playerKilled(EntityPlayerMP player, DamageSource source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void baseAttacked(ITeamBase base, DamageSource source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void objectAttacked(ITeamObject object, DamageSource source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void baseClickedByPlayer(ITeamBase base, EntityPlayerMP player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void objectClickedByPlayer(ITeamObject object, EntityPlayerMP player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vec3 getSpawnPoint(EntityPlayerMP player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void playerChoseTeam(EntityPlayerMP player, Team team) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playerChoseClass(EntityPlayerMP player, PlayerClass playerClass) {
		// TODO Auto-generated method stub
		
	}

}
