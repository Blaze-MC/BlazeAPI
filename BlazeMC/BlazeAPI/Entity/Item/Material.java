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

package info.BlazeMC.BlazeAPI.Entity.Item;

public enum Material
{
	STONE("Stone", 1, (byte) 0);
	
	private String name;
	private int itemID;
	private byte itemData;
	
	Material(String name, int itemID, byte itemData)
	{
		this.name = name;
		this.itemID = itemID;
		this.itemData = itemData;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getItemID()
	{
		return itemID;
	}
	
	public byte getItemData()
	{
		return itemData;
	}
	
	public static Material getByName(String name)
	{
		for(Material mat : Material.values())
		{
			if(mat.getName() == name)
			{
				return mat;
			}
		}
		
		return null;
	}
	
	public static Material getByID(int itemID)
	{
		for(Material mat : Material.values())
		{
			if(mat.getItemID() == itemID)
			{
				return mat;
			}
		}
		
		return null;
	}
	
	public static Material getByID(int itemID, byte itemData)
	{
		for(Material mat : Material.values())
		{
			if(mat.getItemID() == itemID && mat.getItemData() == itemData)
			{
				return mat;
			}
		}
		
		return null;
	}
}
