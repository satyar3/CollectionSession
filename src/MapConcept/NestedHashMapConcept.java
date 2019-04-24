package MapConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class NestedHashMapConcept
{
	public static void main(String[] args)
	{
		HashMap<HashMap<String,String>,String> hs = new HashMap<HashMap<String,String>, String>();
				
		hs.put(new HashMap(){{put("1","1a");}}, "1one");
		hs.put(new HashMap(){{put("2","2a");}}, "2two");
				
		for(Entry<HashMap<String,String>,String> e: hs.entrySet())
		{
			for(Entry<String,String> i : e.getKey().entrySet())
			{
				System.out.println("Outer Value : "+e.getValue());
				System.out.println("Inner Value : "+i.getValue());
			}
		}
	}
}
