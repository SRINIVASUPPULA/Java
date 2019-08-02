package polymorphism;

//A class that implements interface. 

public class InterfaceImplementation implements InterfaceExp{

	public static void main(String[] args) {

		InterfaceImplementation obj = new InterfaceImplementation();
		obj.display(); //this class's overridden method
		System.out.println("variable from interface "+obj.a);
		System.out.println("variable from interface using ref "+InterfaceExp.a);
		
		//InterfaceExp x = new InterfaceExp(); an interface can'nt be instantiated or object can't be created
		
	}

	@Override
	public void display() {
        System.out.println("Interface implemented class"); 
		
	}

}
