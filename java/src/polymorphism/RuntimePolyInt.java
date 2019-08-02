package polymorphism;

public class RuntimePolyInt implements InterfaceExp {
	
	int num=50;
	
	public static void main(String[] args) {
		
		InterfaceExp obj = new RuntimePolyInt();
		obj.display();
		System.out.println(obj.a);
		//child class methods and variables can't be accessed using interface reference
	//	obj.test();
	//	System.out.println(obj.num);
		
		RuntimePolyInt obj2 = new RuntimePolyInt();
		obj2.display();
		System.out.println(obj2.a);
		obj2.test();
		System.out.println(obj2.num);

	}

	@Override
	public void display() {
		System.out.println("this is defined class method of implemented interface ");
	}
	public void test() {
		System.out.println("this is test method from child class ");
	}

}
