package reference;

public class Application {

	public static void main(String[] args) {
	
		
		Payment p;
		p = new Gpay();
		p.reward();
		p.checkBalance();
		
		p = new Paytm();
		p.reward();
		p.checkBalance();
		
		p = new Razarpay();
		p.reward();
		p.checkBalance();
	}

}
