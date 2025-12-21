package combination;

import java.util.Scanner;

public class Employee_Call {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();

		System.out.print("Enter Bonus: ");
		double bonus = sc.nextDouble();
		Manager m = new Manager(id, salary, bonus);
		
		System.out.println("\nChoose Option:");
        System.out.println("1. Display Employee Details");
        System.out.println("2. Calculate Total Salary");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                m.DisplayEmployee();
                break;

            case 2:
                m.calculateTotalSalary();
                break;

            default:
                System.out.println("Invalid Choice");
        }
	}
}
