package practice;

public class Dog extends Animal
{
Dog(String name) {
		super(name);
		System.out.println("Dog const call..");
	}

void sound() {
	System.out.println("This is The Dog sound..!!");
}
}
