package abstraction;

public class OnlineOrder implements Payment, Notification  {
	
	public void pay() {
        System.out.println("Payment successful");
    }

    public void notifyUser() {
        System.out.println("Notification sent to user");
    }

    public static void main(String[] args) {
        OnlineOrder o = new OnlineOrder();
        o.pay();
        o.notifyUser();
    }
}
