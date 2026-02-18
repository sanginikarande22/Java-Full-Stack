package com.controller;

import java.util.Scanner;

import com.service.EmployeePojo;
import com.service.Employee_Service;

public class Employee_Controller {

	public static void main(String[] args) throws Exception {
		EmployeePojo ep = new EmployeePojo();
		Employee_Service ss = new Employee_Service();

		Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. View Data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter your Information");
                    System.out.println("Enter your ID : ");
                    ep.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Enter your First Name : ");
                    ep.setName(sc.nextLine());
                    
                    System.out.println("Enter your Last Name :  ");
                    ep.setLastname(sc.nextLine());
                    System.out.println("Enter your City : ");
                    ep.setCity(sc.nextLine());
                    System.out.println("Enter your Number : ");
                    ep.setNumber(sc.nextLong());;
                    System.out.println("Enter your Aadhar Number : ");
                    ep.setAadharNo(sc.nextLong());
                    sc.nextLine();
                    System.out.println("Enter your Email : ");
                    ep.setEmailAddress(sc.nextLine());
                    System.out.println("Enter your Branch : ");
                    ep.setBranch(sc.nextLine());
                    System.out.println("Enter your PanCard Number : ");
                    ep.setPancard(sc.nextLine());
                    System.out.println("Enter your Salary : ");
                    ep.setSalary(sc.nextDouble());
                    ss.insertData(ep);
                    break;
                    

                case 2:
                    System.out.println("Update Data");
                    sc.nextLine();
                    System.out.println("Enter Updated Name : ");
                    ep.setName(sc.nextLine());
                    System.out.println("Enter Updated City : ");
                    ep.setCity(sc.nextLine());
                    System.out.println("Enter your ID : ");
                    ep.setId(sc.nextInt());
                    ss.updateData(ep);
                    break;

                case 3:
                    System.out.println("Delete Data");
                    System.out.println("Enter id to delete row");
                    ep.setId(sc.nextInt());
                    ss.deleteData(ep);
                    break;

                case 4:
                    System.out.println("View Data");
                    ss.fetchAllData(ep);
                    break;

                case 5:
                    System.out.println("Exiting Program... Thank You");
                    break;

                default:
                    System.out.println("Invalid Option! Please select between 1 to 5.");
            }

        } while (choice != 5);

        sc.close();
	}

}
