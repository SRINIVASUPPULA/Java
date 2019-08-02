package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExp {

	public static <E> void main(String[] args) {
		int a[] = new int[3]; //static array is fixed
		
		//dynamic array -- ArrayList
		//1. can contain duplicate values/elements
		//2. maintains insertion order
		//3. synchronized
		//4. allows random access to fetch the element because it stores the values on the basis of indexes
		
		ArrayList ar = new ArrayList(); //we have to mention - Generics(which type of datatypes) 
		ar.add(10); //0
		ar.add(30); //1
		ar.add(10); //2
		
		System.out.println("Size of ArrayList: "+ar.size()); //size of arraylist
		
		ar.add(44);
		ar.add("Test");
		ar.add(3.14);
		ar.add(90);
		
		System.out.println("Element at index 3:"+ar.get(3)); //to get an value of index
		System.out.println("Size of ArrayList after updating: "+ar.size());
				
		System.out.println("********************");
		//to print all the values of arraylist
		
	//0.to print all the values 
		System.out.println(ar);
		System.out.println("********************");
	//1.For Loop
		for(int i=0;i<ar.size();i++) {
			System.out.print(ar.get(i)+"  ");
		}
		
		//Non generic vs generic
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Hello");
		//ar2.add(13); wont accept integer.coz we mentioned generic as String
		ar2.add("Selenium");
		
		System.out.println("********************");
		//mention generic E,if we dont the storing values datatype
		ArrayList<E> ar3 = new ArrayList<E>();
		
		
		Employee e1 = new Employee("CNU",12,"QA");
		Employee e2 = new Employee("VASU",13,"DB");
		Employee e3 = new Employee("UPPULA",14,"DEV");
		
		System.out.println("********************");
		//create an arraylist - storing Objects
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
	//2.Iterator
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			//store values in a object
			Employee emp = it.next();
			System.out.println(emp.name+" "+emp.age+" "+emp.dept);
		}
		
		System.out.println("********************");
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Adds");
		ar5.add("other Arraylist");
		ar5.addAll(ar2);
		
		for(int i=0;i<ar5.size();i++) {
			System.out.print(ar5.get(i)+" ");	
		}
		
		System.out.println("********************");
	//retainAll -gives the common elements in both the arraylists-Case sensitive
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Selenium");
		ar6.add("Hello");
		ar6.add("gives common value");
		
		ar6.retainAll(ar5);
		for(int i=0;i<ar6.size();i++) {
			System.out.println(ar6.get(i)+" ");	
		}
		
	}

}
