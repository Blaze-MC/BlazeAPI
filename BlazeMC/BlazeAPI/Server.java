package info.BlazeMC.BlazeAPI;

import java.util.Collection;
import java.util.UUID;

import info.BlazeMC.BlazeAPI.Entity.Player;

public interface Server 
{
	/**
	 * Gets a list of online players.
	 * 
	 * @return collection of online players
	 */
	public Collection<Player> getOnlinePlayers();
	
	/**
	 * Gets a player by their name.
	 * 
	 * @param name - The name of the player.
	 * @return a player
	 */
	public Player getPlayer(String name);
	
	/**
	 * Gets a player by their UUID.
	 * 
	 * @param uuid - The UUID of the player.
	 * @return a player
	 */
	public Player getPlayer(UUID uuid);
	
	/**
	 * Gets the server address.
	 * 
	 * @return server address
	 */
	public String getAddress();
	
	/**
	 * Gets the server port.
	 * 
	 * @return server port
	 */
	public int getPort();
	
	/**
	 * Gets the server name.
	 * 
	 * @return server name
	 */
	public String getName();
	
	/**
	 * Broadcast a message to all players.
	 * 
	 * @param message- The message to be broadcasted.
	 */
	public void broadcast(String message);
}
