package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>(); 
		
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//contents of linkedlist
		System.out.println(ll);
		
		//addfirst
		ll.addFirst("Naveen");
		ll.addLast("Automation");
		
		System.out.println(ll);
		
		//get
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		
		//set
		ll.set(1, "TOM");
		System.out.println(ll.get(1));
		
		//remove last and first element
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		ll.remove(2);
		System.out.println(ll);
		
		//print all the values of linkedlist
		//1.using for loop
		//2.advance for loop
		//3.while loop
		//4.Iterator
		
		//1.using for loop
		for(int i = 0 ; i<ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}
		
		//2.advance for loop
		for(String str:ll)
		{
			System.out.println(str);
		}
		
		//4.Iterator		
		Iterator<String> it = ll.iterator();
		
		System.out.println("***************");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		/*System.out.println("***********************");
		for(;it.hasNext();)
		{
			System.out.println("_____");
			System.out.println(it.next());
		}
		System.out.println("***********************");*/ //why ?
		
		//3.while loop
		System.out.println("************************");
		int i = 0;
		while(i<ll.size())
		{
			System.out.println(ll.get(i));
			i++;
		}
	}

}
