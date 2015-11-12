package info.BlazeMC.BlazeAPI;

public final class Blaze
{
	private static Server server;
	private static BlazeLogger logger = new BlazeLogger();
	
	public static BlazeLogger getLogger()
	{
		return logger;
	}
	
	public static void setServer(Server ser)
	{
		server = ser;
	}
	
	public static Server getServer()
	{
		return server;
	}
}
