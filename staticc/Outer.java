package staticc;

public class Outer {

	static class Inner{
		
		
		void msg() {
		System.out.println("This is nested class method");
	}
		
			
		}
	public static void main(String[] args) {
		Inner i=new Inner();
		i.msg();
	}
}
