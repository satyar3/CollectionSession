package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i[] = new int[3]; //static array i.e size is fixed
		
		//dynamic array i.e ArrayList
		//1.it can contain duplicate value
		//2.it inserts value in order i.e it maintains insertion order
		//3. it's not synchronized
		//4. allows to random access to fetch any element as it stores the values basis of indexes
		
		//Non Generics
		ArrayList ar = new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add("Test");
		ar.add(12.33);
		
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		//Print all the values from ArrayList
		
		//1. using for loop
		for(int i = 0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		//Generics. Available from JDK 1.5
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("selenium");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Hello");
		ar2.add("Hello world");
		
		//If we are not sure about the data type which will be inserted
		ArrayList<E> ar3 = new ArrayList<E>();
		
		//Employee Class object
		
		Employee e1 = new Employee("Naveen", 27, "QA");
		Employee e2 = new Employee("Tom", 28, "Dev");
		Employee e3 = new Employee("Peter", 29, "HR");
		
		//Create ArrayList
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Iterator to traverse through the values
		Iterator<Employee> it = ar4.iterator();
		
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.println(emp.empName);
			System.out.println(emp.age);
			System.out.println(emp.department);
		}
		
		//addAll method
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Selenium");
		ar5.add("QTP world");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Dev");
		ar6.add("Java world");
		ar6.add("Java Script");
		
		//all the ar6 elemets will be stored in ar5 object
		ar5.addAll(ar6);
		
		for (int i = 0; i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		
		//removeAll
		ar5.removeAll(ar6);
		for (int i = 0; i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		
		//retainAll -- to check common element
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("test");
		ar7.add("Selenium");
		ar7.add("QTP world");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Dev");
		ar8.add("Java world");
		ar8.add("Java Script");
		ar8.add("test");
		
		ar7.retainAll(ar8);
		for (int i = 0; i<ar7.size();i++)
		{
			System.out.println(ar7.get(i));
		}
	}

}
