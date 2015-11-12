package info.BlazeMC.BlazeAPI;

import java.util.HashMap;

public class ChatStyle 
{
	//So glad I figured this out... Seems like everyone else did it the hard way.
	public static final String BLACK = "§0";
	public static final String DARK_BLUE = "§1";
	public static final String DARK_GREEN = "§2";
	public static final String DARK_AQUA = "§3";
	public static final String DARK_RED = "§4";
	public static final String DARK_PURPLE = "§5";
	public static final String GOLD = "§6";
	public static final String GRAY = "§7";
	public static final String DARK_GRAY = "§8";
	public static final String BLUE = "§9";
	public static final String GREEN = "§a";
	public static final String AQUA = "§b";
	public static final String RED = "§c";
	public static final String LIGHT_PURPLE = "§d";
	public static final String YELLOW = "§e";
	public static final String WHITE = "§f";
	public static final String OBFUSCATED = "§k";
	public static final String BOLD = "§l";
	public static final String STRIKETHROUGH = "§m";
	public static final String UNDERLINE = "§n";
	public static final String ITALIC = "§o";
	public static final String RESET = "§r";
	
	public static HashMap<String, String> values = new HashMap<String, String>();
	
	static {
		values.put("&0", "§0");
		values.put("&1", "§1");
		values.put("&2", "§2");
		values.put("&3", "§3");
		values.put("&4", "§4");
		values.put("&5", "§5");
		values.put("&6", "§6");
		values.put("&7", "§7");
		values.put("&8", "§8");
		values.put("&9", "§9");
		values.put("&a", "§a");
		values.put("&b", "§b");
		values.put("&c", "§c");
		values.put("&d", "§d");
		values.put("&e", "§e");
		values.put("&f", "§f");
		values.put("&k", "§k");
		values.put("&l", "§l");
		values.put("&m", "§m");
		values.put("&n", "§n");
		values.put("&o", "§o");
		values.put("&r", "§r");
	}
	
	public static String strip(String text)
	{
		for(String key : values.keySet())
		{
			text = text.replaceAll(key, "");
		}
		
		for(String value : values.values())
		{
			text = text.replaceAll(value, "");
		}
		
		return text;
	}
	
	public static String translate(String text)
	{
		for(String key : values.keySet())
		{
			text = text.replaceAll(key, values.get(key));
		}
		
		return text;
	}
}
