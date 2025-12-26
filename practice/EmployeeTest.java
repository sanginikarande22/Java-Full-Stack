package practice;

import java.util.Scanner;

public class EmployeeTest {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id: " );
		int id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter the city : ");
		String city  =sc.nextLine();	
		
		
		System.out.println("Enter the state : ");
		String state  =sc.nextLine();	
		
		 Address addr = new Address(city, state);
		 Empolyee2 emp=new Empolyee2(id,name,addr) ;

	        System.out.println("\n--- Employee Details ---");
	        emp.showDetails();

	        sc.close();
	}
	
}
