package practice;

import java.util.Scanner;

public class StudentCourseTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		
		System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Choose Course Type:");
        System.out.println("1. Degree");
        System.out.println("2. Diploma");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter Duration (months): ");
        int duration = sc.nextInt();

        Course course;

        if (choice == 1) {
            course = new DegreeCourse(courseName, duration);
        } else {
            course = new DiplomaCourse(courseName, duration);
        }

        Student student = new Student(id, name, course);
        student.showsummary();


        sc.close();
    }
}
