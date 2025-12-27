package staticc;

public class Student {

	int id;
	String name;
	static String collegeName= "JSPM";
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	void display() {
		System.out.println("Student ID: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("College Name: "+collegeName);
		
	}
	
	
	
	
	
}
