package practice;

public class Cat extends Animal{
	
	Cat(String name) {
		
		super(name);
System.out.println("cat constr call..");
	}

	void sound() {
		
		System.out.println("This is The Cat sound..!!");
	}
}