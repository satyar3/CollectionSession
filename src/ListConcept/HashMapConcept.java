//package MapConcept;
package ListConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap is class implements map interface
		//extends AbstarctMap
		//HashMap contains only unique elements
		//It store the values in the form of Key and Value Pair
		//It may have new Null Key and multiple Null values
		//It maintains no order
		//Hashmap is non synchronized i.e it can accessed by multiple threads i.e. not thread safe
		//Disadvantage: concurrent operation causing updation in value i.e. concurrent modification exception or fail fast condition
		//Concurrently 2 threads is operating on one value but not in case of reading values
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"Selenium");
		hm.put(2, "QTP");
		hm.put(3, "Test Complete");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		for (Entry<Integer, String> m:hm.entrySet()) 
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom", 25, "Admin");
		Employee e2 = new Employee("Peter", 26, "QA");
		Employee e3 = new Employee("Steve", 27, "Dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee > m: emp.entrySet())
		{
			int key = m.getKey();
			Employee e = m.getValue();
			
			System.out.println(key+e.empName+e.age+e.department);
		}

	}

}