package info.BlazeMC.BlazeAPI.Entity;

import java.util.Collection;
import java.util.UUID;

import info.BlazeMC.BlazeAPI.GameMode;
import info.BlazeMC.BlazeAPI.Inventory.Inventory;

public interface Player 
{
	/**
	 * Gets the name of the player.
	 * 
	 * @return player name
	 */
	public String getName();
	
	/**
	 * Gets the UUID of the player.
	 * 
	 * @return player uuid
	 */
	public UUID getUUID();
	
	/**
	 * Sends a message to the player.
	 * 
	 * @param message - The message to send to the player.
	 */
	public void sendMessage(String message);
	
	/**
	 * Checks if a player has a permission.
	 * 
	 * @param permission - The permission to check.
	 * 
	 * @return player has permission
	 */
	public boolean hasPermission(String permission);
	
	/**
	 * Adds a permission to a player.
	 * 
	 * @param permission - The permission to add
	 */
	public void addPermission(String permission);
	
	/**
	 * Remove a permission from a player.
	 * 
	 * @param permission - The permission to remove
	 */
	public void removePermission(String permission);
	
	/**
	 * The list of permissions a player has.
	 * 
	 * @return list of permissions
	 */
	public Collection<String> getPermissions();
	
	/**
	 * Changes a players gamemode.
	 * 
	 * @param mode - The mode to change the players gamemode to.
	 */
	public void setGameMode(GameMode mode);
	
	/**
	 * Gets the players gamemode.
	 * 
	 * @return player gamemode
	 */
	public GameMode getGamemode();
	
	/**
	 * Checks if the player is blocking.
	 * 
	 * @return player blocking
	 */
	public boolean isBlocking();
	
	/**
	 * Gets the health of the player.
	 * 
	 * @return player health
	 */
	public float getHealth();
	
	/**
	 * Changes the players health.
	 * 
	 * @param amount - The amount to change the players health to.
	 */
	public void setHealth(float amount);	
	
	/**
	 * Gets the hunger of the player.
	 * 
	 * @return player hunger
	 */
	public int getHunger();
	
	/**
	 * Changes the players hunger.
	 * 
	 * @param amount - The amount to change the players hunger to.
	 */
	public void setHunger(int amount);
	
	/**
	 * Gets the players inventory.
	 * 
	 * @return player inventory
	 */
	public Inventory getInventory();
	
	/**
	 * Updates the players inventory.
	 */
	public void updateInventory();
}	
