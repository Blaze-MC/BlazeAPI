package info.BlazeMC.BlazeAPI.Event.Player;

import info.BlazeMC.BlazeAPI.Entity.Player;
import info.BlazeMC.BlazeAPI.Event.Event;

public class PlayerJoinEvent extends PlayerEvent
{
	private String joinMessage;
	
	public PlayerJoinEvent(Player player, String joinMessage)
	{
		super(player);
		this.joinMessage = joinMessage;
	}
	
	public String getJoinMessage()
	{
		return this.joinMessage;
	}
	
	public void setJoinMessage(String message)
	{
		this.joinMessage = message;
	}
}
