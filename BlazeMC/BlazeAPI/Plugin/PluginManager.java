package info.BlazeMC.BlazeAPI.Plugin;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

import info.BlazeMC.BlazeAPI.Command.CommandListener;
import info.BlazeMC.BlazeAPI.Entity.Player;
import info.BlazeMC.BlazeAPI.Event.Cancellable;
import info.BlazeMC.BlazeAPI.Event.Event;
import info.BlazeMC.BlazeAPI.Event.EventListener;
import info.BlazeMC.BlazeAPI.Event.HandleEvent;

public class PluginManager
{
	private static ArrayList<EventListener> events = new ArrayList<EventListener>();
	private static HashMap<String, CommandListener> commands = new HashMap<String, CommandListener>();
	
	public static void registerCommand(String command, CommandListener listener)
	{
		commands.put(command, listener);
	}
	
	public static void registerEvent(EventListener listener)
	{
		events.add(listener);
	}
	
	//TODO EventPriority
	@SuppressWarnings("rawtypes")
	public static Event raiseEvent(Event event) 
	{
		for(EventListener listener : events)
		{
			Class handler = listener.getClass();
			Method[] methods = handler.getMethods();

			for(int i = 0; i < methods.length; ++i) 
			{
				HandleEvent eventHandler = methods[i].getAnnotation(HandleEvent.class);
				
				if(eventHandler != null)
				{
					Class[] methodParams = methods[i].getParameterTypes();

					if(methodParams.length != 1)
						continue;

					if(!event.getClass().getSimpleName().equals(methodParams[0].getSimpleName()))
						continue;

					if(event instanceof Cancellable)
					{
						if(((Cancellable)event).isCancelled()) 
						{
							return event;
						}
					}
					
					try
					{
						methods[i].invoke(listener, event);
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
			}
		}
		
		return event;
	}
	
	public static void raiseCommand(Player player, String label, String[] args)
	{
		for(CommandListener cmd : commands.values())
		{
			cmd.proccessCommand(player, label, args);
		}
	}
	
	public static boolean isCommand(String label)
	{
		return commands.containsKey(label);
	}
}
