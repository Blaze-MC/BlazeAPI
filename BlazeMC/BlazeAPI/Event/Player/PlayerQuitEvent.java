package info.BlazeMC.BlazeAPI.Event.Player;

import info.BlazeMC.BlazeAPI.Entity.Player;

public class PlayerQuitEvent extends PlayerEvent
{
	private String quitMessage;
	
	public PlayerQuitEvent(Player player, String quitMessage)
	{
		super(player);
		this.quitMessage = quitMessage;
	}
	
	public String getQuitMessage()
	{
		return this.quitMessage;
	}
	
	public void setQuitMessage(String message)
	{
		this.quitMessage = message;
	}
}