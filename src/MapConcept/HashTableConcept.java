package MapConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//it is similar to hashmap but it's synchronized i.e only one thread can access once object
		//stores the data in key and value
		//key -- Object --- Hashcode -- Value will be associated to the HashCode
		//it conatins unique value
		//it can't have any null key and null value
		
		Hashtable hs = new Hashtable();
		hs.put(1, "Tom");
		hs.put(2, "Test");
		hs.put(3,"QA");
		hs.put(3,"QA"); //it'll be ignored
		
		System.out.println(hs.get(3));
		System.out.println(hs.hashCode());
		
		Hashtable hs1 = new Hashtable();
		
		hs1 = (Hashtable) hs.clone();
		
		System.out.println(hs1);
		
		if(hs.containsValue("QA"))
		{		
			System.out.println("exisit");
		}
		
		//Pint all the values
		Enumeration es = hs.elements();
		
		while(es.hasMoreElements())
		{
			System.out.println(es.nextElement());
		}
		
		//get all the values from HashTable from Entryset
		
		Set e = hs.entrySet();
		System.out.println(e);
		
		//Check if both the Hashtable are equal or not
		
		Hashtable hs11 = new Hashtable();
		hs11.put(1, "Tom");
		hs11.put(2, "Test");
		hs11.put(3,"QA");
		System.out.println(hs11.get(3)+"*********");
		
		
		if(hs11.equals(hs))
			System.out.println("true matching");		
		
		hs11.clear();
		
		//generics
		Hashtable<Integer, String> hs111 = new Hashtable<Integer, String>();
		hs111.put(1, "Tom");
		hs111.put(2, "Test");
		hs111.put(3,"QA");
		hs111.put(3,"QA");
	}

}
