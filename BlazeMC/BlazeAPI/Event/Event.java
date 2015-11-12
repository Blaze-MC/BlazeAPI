package info.BlazeMC.BlazeAPI.Event;

public abstract class Event
{
	public String getName()
	{
		return getClass().getSimpleName();
	}
}
