package polymorphism;

public class Puppy extends Dog{
	
	String puppyVar = "Puppy";
	String animalVar = "hello";

	public void move() {
		System.out.println("puppy can move"); 
	}
	
	public void inh() {
		move(); //from puppy class
		System.out.println("puppy variable "+puppyVar);
		
		Dog d = new Puppy();
		System.out.println("Animal Variable from Puppy class "+d.animalVar);
		System.out.println("Dog variable from puppy class "+d.dogVar);
		d.move(); //from do class
	}	
	
}
