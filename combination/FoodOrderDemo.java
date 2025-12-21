package combination;

import java.util.Scanner;

public class FoodOrderDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--------------Food Ordering System---------- ");

        System.out.print("Enter number of food items: ");
        int n = sc.nextInt();

     
        for (int i = 1; i <= n; i++) {
            System.out.println("\nFood Item " + i);

            System.out.print("Enter Item Name: ");
            String name = sc.next();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            Order o = new Order(name, price, qty);

   
            System.out.println("\nChoose Option:");
            System.out.println("1. Display Item Details");
            System.out.println("2. Calculate Bill");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    o.displayItem();
                    break;

                case 2:
                    o.calculateBill();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}
