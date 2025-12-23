package abstractclass;

public class Call_ex1 {
	public static void main(String[] args) {

        Payment p;   

        p = new UPI();
        p.pay(1500);
        p.billInfo();

        p = new Credit_Card();
        p.pay(3000);
        p.billInfo();
    }
}

