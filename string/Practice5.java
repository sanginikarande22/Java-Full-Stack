package string;

public class Practice5 {
public static void main(String[] args) {
	String s="JAVA";
	String s1="JAVA";
	if(s.equals(s1)) {
		System.out.println("String is Equal ");
	}else {
		System.out.println("String is not equal");
	}
	
	if(s==s1) {
		System.out.println("reference  is Equal ");
	}else {
		System.out.println("reference is not equal");
	}

}

}
