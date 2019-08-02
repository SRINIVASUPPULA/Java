package polymorphism;

public class Dog extends Animal {

	String dogVar = "Dog";

	public void move() {
		System.out.println("Dogs can walk and run");
		
		//Dog b = new Animal();
		
		System.out.println("String animal from Dog class "+animalVar); //from animal class
		
				//move(); //from dog class - giving infinite loop - should be static method to access in main method of this class
		
		Animal an = new Animal();
		System.out.println(an.animalVar);
		an.move();
		
	}
	
	
	
}
