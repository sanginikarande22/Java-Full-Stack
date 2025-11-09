package operators;

public class Relational_operator {
	public static void main(String[] args) {
		
//		Logical Operator	&&    AND 

//		System.out.println(true && true);    // true
//		System.out.println(true && false);   // false
//		System.out.println(false && true);   // false
//		System.out.println(false && false);  // false 
		
		System.out.println(10>7 && 8>3);
		System.out.println(3>7 && 8>3);
		
//		Logical Operator	||    OR
		
//		System.out.println(true || true);  // true
//		System.out.println(true || false); // true
//		System.out.println(false || true); // true
//		System.out.println(false || false); // false
		System.out.println(60<11 || 11<100);
		System.out.println(60<11 || 1>90);
		
//		Logical Operator	!    NOT
		
		System.out.println(!(90<12));
		System.out.println((90<12));
		

		
	}

}
