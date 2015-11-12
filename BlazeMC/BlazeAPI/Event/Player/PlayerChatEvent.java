package info.BlazeMC.BlazeAPI.Event.Player;

import info.BlazeMC.BlazeAPI.Entity.Player;

public class PlayerChatEvent extends PlayerEvent
{
	private String format;
	private String message;
	
	public PlayerChatEvent(Player player, String format, String message)
	{
		super(player);
		this.format = format;
		this.message = message;
	}
	
	public String getFormat()
	{
		return format;
	}
	
	public void setFormat(String format)
	{
		this.format = format;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
}
