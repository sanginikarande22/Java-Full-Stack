package staticc;

public class Bank_Main {
	public static void main(String[] args) {

     
        Bank acc1 = new Bank(5000);
        Bank acc2 = new Bank(10000);

  
        acc1.displayDetails();
        acc2.displayDetails();

   
        Bank.changeROI(6.5);

     
        acc1.displayDetails();
        acc2.displayDetails();
	}
}