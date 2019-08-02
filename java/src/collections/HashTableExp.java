package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableExp {

	public static void main(String[] args) {

		//it is similar to hashmap, but it is synchronised
		//stores the value on the basis of key-val
		//key--> object -- hashcode ---> value
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Selenium");
		
		//create a clone copy/shallow copy
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable)h1.clone(); //copies the elements from h1 to h2
		
		System.out.println("The values from h1 "+h1);
		System.out.println("The values from h2 "+h2);
		
		h1.clear(); //deletes all the elements from h1 hashtable
		System.out.println("The values from h1 "+h1); //gives empty hashtable
		System.out.println("The values from h2 "+h2); //but,h2 hashtable elements still exists
		
		//contanis values:
		 Hashtable st = new Hashtable();
		 st.put("A", "Java");
		 st.put("B", "Selenium");
		 st.put("C", "Maven");
		
		 if(st.containsValue("Selenium"))
			 System.out.println("value is found"); //compare whether the value is extsts in the hashtable or not
		 
		 //print all the values from hashtable using -- enumaration -- elements()
		 Enumeration e = st.elements();
		 System.out.println("printing values from st"); //enumeration is just like Iterator
			 
		 while(e.hasMoreElements()) {
			 System.out.println(e.nextElement());
		 }
		 
		 //get all the values from hashtable using -- entryset() -- set hashtable values
		 System.out.println("print values from st using entry set");
		 
		 Set s = st.entrySet();
		 System.out.println(s);
		 
		 Hashtable st1 = new Hashtable();
		 st1.put("A", "Java");
		 st1.put("B", "Selenium");
		 st1.put("C", "Maven");
		 st1.put("B", "Selenium"); //it contains only unique values
		 
		 //no null values and null keys
		// st1.put("D", null);//wont allows to store null values - gives null pointer exception
		 
		 System.out.println(st1);
		 
		 //check both the hashtables are equal or not:
		 if(st.equals(st1))
			 System.out.println("both are equal"); //compares two Hashtables
		 
		 //get the value from a key
		 System.out.println(st1.get("A"));
		 
		 //get the hashcode of hashtable object:
		 System.out.println("the hashcode value of st1: "+st1.hashCode());
		 
		 //generics:
		 Hashtable<String, String> st3 = new Hashtable<String, String>(); 
		 
	}

}
