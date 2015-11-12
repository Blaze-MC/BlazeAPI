package info.BlazeMC.BlazeAPI.Event.Player;

import info.BlazeMC.BlazeAPI.Entity.Player;
import info.BlazeMC.BlazeAPI.Event.Event;

public abstract class PlayerEvent extends Event
{
	private Player player;
	
	public PlayerEvent(Player player)
	{
		this.player = player;
	}
	
	public Player getPlayer()
	{
		return player;
	}
}
