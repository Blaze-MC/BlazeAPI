package info.BlazeMC.BlazeAPI.Plugin;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;

public class Plugin 
{
	private PluginDescription desc;

	public void onEnable(){}
	public void onDisable(){}

	public void setDescription(PluginDescription desc)	
	{
		this.desc = desc;
	}

	public PluginDescription getDescription()
	{
		return desc;
	}

	public void saveResource(String resource)
	{
		try 
		{
			File inFile = new File(getResource(resource).toURI());
			File outFile = new File("plugins/" + getDescription().getName() + "/" + resource);

			FileReader reader = new FileReader(inFile);
			FileWriter writer = new FileWriter(outFile);

			int c;
			
			while((c = reader.read()) !=-1) 
			{
				writer.write(c);
			} 
			
			reader.close();
			writer.close();
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	public URL getResource(String resource)
	{
		URL url = getClass().getResource(resource);

		return url;
	}
}
