package icbm.api.explosion;

public enum ExplosiveType
{
	ALL,
	/** An explosive in TNT block form. */
	BLOCK,
	/** An explosive in item form such as a grenade. */
	ITEM,
	/** An explosive in aircraft form such as a missile. */
	AIR,
	/** An explosive in vehicle form such as a minecart. */
	VEHICLE;

	public static ExplosiveType get(int id)
	{
		if (id >= 0 && id < ExplosiveType.values().length)
		{
			return ExplosiveType.values()[id];
		}

		return null;
	}
}
