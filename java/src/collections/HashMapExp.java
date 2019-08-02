package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExp {

	public static void main(String[] args) {
		
		//HashMap is a class implements map Interface
		//extends Abstract Map
		//it contains only unique elements
		//stores the values - key -value pair
		//it may have one null key and multiple null values
		//it maintains no order
		//hashmap is non-synchronized(accessed at a time) - multi threading - can accessed by only one thread at a time - non thread safe
		//Concurrent Modification Exception - Fail Fast condition - occurs at the time of element is modified/removed in a hashmap that is accessing by other thread
		
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "Katalon");

		System.out.println(hm.get(3)); //accessing sing value
		System.out.println(hm.get(5));
		
		//traversing the hashmap to get all the values 
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		System.out.println(hm);
		hm.remove(2); //removing single element by passing key
		System.out.println(hm); //priniting all the values in <key,value> format
		
		
		//storing objects as values
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("Karl",23,"admin");
		Employee e2 = new Employee("Balder",24,"QA");
		Employee e3 = new Employee("Bankrupt",27,"dev");

		emp.put(100, e1);
		emp.put(101, e2);
		emp.put(103, e3);
		
		//traverse the hashmap
		for(Entry m : emp.entrySet()) {
			//System.out.println(m.getKey()+"  "+m.getValue());  -value is an object - so it won't work
			int key = (int) m.getKey();
			Employee e = (Employee) m.getValue(); //creating employee object to access variables in it 
			System.out.println(key+"  info: ");
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}
	
	}

}
