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
