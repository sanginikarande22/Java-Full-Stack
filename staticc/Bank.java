package staticc;

public class Bank {
	static double  rateOfInterest=5.0;
	double balance;
	
	static void changeROI(double newROI) {
		System.out.println();
		rateOfInterest = newROI;
	}
	Bank(double balance) {
        this.balance = balance;
		
		
	}
		void displayDetails() {
	        System.out.println("Account Balance: " + balance);
	        System.out.println("Rate of Interest: " + rateOfInterest + "%");
	        System.out.println("-------------------------");

	}
}

