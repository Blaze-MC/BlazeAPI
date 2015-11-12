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
