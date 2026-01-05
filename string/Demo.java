package string;

public class Demo {

	public static void main(String[] args) {

		// type 1) Through string literal with same values
		String s1 = "Hello";
		String s2 = "hello";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		// Type 1) Through string literal with different values
		String s = "java";
		String ss = s1;
		String s3 = "python";

		System.out.println(s == ss); // references
		System.out.println(s.equals(ss)); // values
		System.out.println(s3==ss);
		
		// Type 2)  With new keyword
		
		String str1= new String("Sam");
		String str2=new String("sam");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
		//With interns
		String str4 = new String("hello");
        String str5 = str4.intern();
        String str6 = "hello";

		System.out.println(str4 == str5);
		System.out.println(str5 == str6);
		
	}

}
