package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExp {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		
		//add
		ll.add("test");
		ll.add("selenium");
		ll.add(24);
		
		//dispaly-print
		System.out.println("Contents in Linkedlist:"+ll);
		System.out.println("********************");
		
LinkedList<String> ll2 = new LinkedList<String>();
		
		//add
		ll2.add("test2");
		ll2.add("selenium2");
		ll2.add("QTP2");
		//addfirst
		ll2.addFirst("RFT2");
		//addlast
		ll2.addLast("Automation");
		System.out.println("Contents in Linkedlist2:"+ll2);
		//get
		System.out.println(ll2.get(3));
		//set
		ll2.set(3, "Set"); //Replaces the old value
	System.out.println(ll2);
	System.out.println("********************");
	
	//remove first and remove last
	ll2.removeFirst();
	ll2.removeLast();
	System.out.println(ll2);
	System.out.println("********************");
	
	//printing all the values in linkedlist
	//forloop
	System.out.println("using for loop");
	for(int i=0;i<ll2.size();i++) {
		System.out.print(ll2.get(i)+" ");
	}
	
	System.out.println("*************");
	System.out.println("using advanced for loop");
	for(String str:ll2) {
		System.out.print(str+" ");
	}
	
	System.out.println("*************");
	System.out.println("using iterator");
	Iterator<String>it = ll2.iterator();
	while(it.hasNext()) {
		System.out.print(it.next()+" ");
	}
	
	System.out.println("*************");
	System.out.println("using while loop");
	int num=0;
	while(ll2.size()>num) {
		System.out.print(ll2.get(num)+" ");
		num++;
	}
	
	}

}
