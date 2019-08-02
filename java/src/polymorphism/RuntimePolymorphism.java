package polymorphism;

public class RuntimePolymorphism {

	public static void main(String[] args) {

		System.out.println("************************");
		Animal a = new Animal();
		System.out.println(a.animalVar); //Normaml Usage
		a.move();
		
		
		System.out.println("************************");
		Animal b = new Puppy();
		System.out.println("Animal ref from Puppy object "+b.animalVar); //from Animal class
		b.move();
		
		
		System.out.println("************************");
		Animal c = new Dog();
		System.out.println("Animal ref from Dog object "+c.animalVar); //from Animal class
		c.move();
		
	//	Dog d =  new Animal(); can't create object to parent class using child class reference
		System.out.println("************************"); 
		Dog e = new Puppy();
		System.out.println(""+e.animalVar); //from dog class
		e.move();
		
		System.out.println("************************");
		Dog i = new Dog();
		System.out.println(i.animalVar); //Normal Usage
		i.move();
		
		
	//	Puppy f = new Animal();
	//	Puppy g = new Dog();
		System.out.println("************************");
		Puppy h = new Puppy();
		System.out.println(h.animalVar); //from puppy - Normal Usage
		h.move(); //from puppy
		/*
		 * if the parent class's method or variable are overridden
		 * then the variable or methods can be accessed from child class
		 * even the reference variable is created for parent
		 * 
		 */
		
		
		

	}

}
