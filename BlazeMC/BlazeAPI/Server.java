/*
The MIT License (MIT)

Copyright (c) 2015 BlazeMC

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

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
