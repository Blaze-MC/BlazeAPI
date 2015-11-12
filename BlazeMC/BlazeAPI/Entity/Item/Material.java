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
