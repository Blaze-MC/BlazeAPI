package info.BlazeMC.BlazeAPI.Entity.Item;

public abstract class ItemStack 
{
	private String name;
	private int itemID;
	private int itemData;
	private int amount;
	
	public ItemStack(Material material, int amount)
	{
		this.name = material.getName();
		this.itemID = material.getItemID();
		this.itemData = material.getItemData();
		this.amount = amount;
	}
	
	public ItemStack(int itemID, byte itemData, int amount)
	{
		this.name = Material.getByID(itemID, itemData).getName();
		this.itemID = itemID;
		this.itemData = itemData;
		this.amount = amount;
	}

	public String getItemName()
	{
		return name;
	}
	
	public int getItemID()
	{
		return itemID;
	}
	
	public int getItemData()
	{
		return itemData;
	}
	
	public int getAmount()
	{
		return amount;
	}
}
