package abstraction;

public class MyApp {
  
	public static void main(String[] args) {
		UPI u;
		u=new PhonePe();
		u.makePayment();
	
		u=new Gpay();
		u.makePayment();
	
		u=new Paytm();
		u.makePayment();
	
		
		
	}
}
