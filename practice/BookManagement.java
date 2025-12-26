package practice;

import java.util.Scanner;

public class BookManagement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter Book ID: ");
		int bookId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Book Title: ");
		String bookTitle = sc.nextLine();
		System.out.print("Enter Book Author: ");
		String bookAuthor = sc.nextLine();
		Book b  = new Book(bookId, bookTitle, bookAuthor);
		

		System.out.print("Enter Student UserID: ");
		int userId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Student Username: ");
		String username = sc.nextLine();

		StudentUser student = new StudentUser(userId, username);

		System.out.println("\n--- Student Details ---");
		student.showDetails();

		System.out.println("\n--- Book Transactions ---");
		student.issueBook();
		student.returnBook();

		sc.close();
	}
}
