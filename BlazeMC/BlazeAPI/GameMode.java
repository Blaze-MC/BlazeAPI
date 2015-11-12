package info.BlazeMC.BlazeAPI;

public enum GameMode 
{
    SURVIVAL("SURVIVAL", 0),
    CREATIVE("CREATIVE", 1),
    ADVENTURE("ADVENTURE", 2),
    SPECTATOR("SPECTATOR", 3);
	
	private String name;
	private int id;
	
	GameMode(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getID()
	{
		return id;
	}
	
	public static GameMode getByID(int id)
	{
		for(GameMode mode : GameMode.values())
		{
			if(mode.getID() == id)
			{
				return mode;
			}
		}
		
		return null;
	}
	
	public static GameMode getByName(String name)
	{
		for(GameMode mode : GameMode.values())
		{
			if(mode.getName() == name)
			{
				return mode;
			}
		}
		
		return null;
	}
}
