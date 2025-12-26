package practice;

public class B extends A {

	B(){
		this(10);
		System.out.println(" B default constructor executed");
		
	}
	B(int a){
		super();
		System.out.println("B parameterized constructor executed");
	}
	public static void main(String[] args) {
		B b=new B();
	}
}
