package info.BlazeMC.BlazeAPI;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BlazeLogger 
{
	private Logger log = LogManager.getLogger();
	
	public void info(String message)
	{
		log.info(message);
	}
	
	public void severe(String message)
	{
		log.fatal(message);
	}
	
	public void warning(String message)
	{
		log.warn(message);
	}
	
	public void log(LogLevel level, String message)
	{
		log.log(level.getApacheLevel(), message);
	}
	
	public enum LogLevel
	{
		SEVERE(Level.FATAL),
		WARNING(Level.WARN),
		INFO(Level.INFO),
		ERROR(Level.ERROR);
		
		private Level apacheLevel;
		
		LogLevel(Level apacheLevel)
		{
			this.apacheLevel = apacheLevel;
		}
		
		public Level getApacheLevel()
		{
			return this.apacheLevel;
		}
	}
}
