package practice;

import java.util.Scanner;

public class Calculator {

	void add(int a, int b) {
		System.out.println(" Addition of two integers: " + (a + b));

	}

	void add(int a, int b, int c) {
		System.out.println(" Addition of three integers: " + (a + b+ c));

	}

	void add(double a, double b) {
		System.out.println(" Addition of two double value: " + (a + b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal=new Calculator();
		
		System.out.print(" Enter Two Integer: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		cal.add(a,b);
		
		System.out.print("Enter Two Integer: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		cal.add(x,y,z);
		
		System.out.print("EnterTwo Integer: ");
		double p = sc.nextDouble();
		double q = sc.nextDouble();
		cal.add(p,q);
		sc.close();
		
		
	}
}
