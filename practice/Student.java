package practice;

public class Student {
int id;
String name;
Course course;
final double REGISTRATION_FEE = 1000;

Student(int id,String name,Course course){
	this.id=id;
	this.name=name;
	this.course=course;
}
	void showsummary() {
		double totalFee = course.fees() + REGISTRATION_FEE;
		 System.out.println("\n--- Student Summary ---");
	        System.out.println("Student ID: " + id);
	        System.out.println("Student Name: " + name);
	        System.out.println("Course Name: " + course.courseName);
	        System.out.println("Course Duration: " + course.duration + " months");
	        System.out.println("Course Fee: " + course.fees());
	        System.out.println("Registration Fee: " + REGISTRATION_FEE);
	        System.out.println("Total Fee: " + totalFee);
	}

}
