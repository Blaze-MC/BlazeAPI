package info.BlazeMC.BlazeAPI.Inventory;

import info.BlazeMC.BlazeAPI.Entity.Item.ItemStack;

public interface Inventory 
{
	public InventoryType getInventoryType();
	public ItemStack[] getContents();
	public void setItem(ItemStack item, int slot);
	public ItemStack getItem(int slot);
	public InventoryViewer getViewer();
}
