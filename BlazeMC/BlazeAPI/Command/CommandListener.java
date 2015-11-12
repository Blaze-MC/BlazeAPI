package info.BlazeMC.BlazeAPI.Command;

import info.BlazeMC.BlazeAPI.Entity.Player;

public interface CommandListener 
{
	public void proccessCommand(Player commandSender, String label, String[] args);
}
