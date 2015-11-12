package info.BlazeMC.BlazeAPI.Event;

public enum EventPriority 
{
	LOWEST(0),
	LOW(1),
	NORMAL(2),
	HIGH(3),
	HIGHEST(4);
	
	private int level;
	
	EventPriority(int level)
	{
		this.level = level;
	}
	
	public int getLevel()
	{
		return level;
	}
}
