package abstractclass;

public abstract class Payment {
	
	abstract void pay(double amount);
	void billInfo() {
        System.out.println("Payment bill is generated");
    }
}
