package info.BlazeMC.BlazeAPI.Plugin;

public class PluginDescription 
{
	private Plugin plugin;
	private String name;
	private String main;
	private String version;
	
	public PluginDescription(Plugin plugin, String name, String main, String version)
	{
		this.plugin = plugin;
		this.name = name;
		this.main = main;
		this.version = version;
	}

	public Plugin getPlugin()
	{
		return plugin;
	}

	public String getName()
	{
		return name;
	}

	public String getMain()
	{
		return main;
	}

	public String getVersion()
	{
		return version;
	}
}
