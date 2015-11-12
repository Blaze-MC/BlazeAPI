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
