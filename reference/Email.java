package reference;

public class Email extends Notification {
	public void send() {
		super.send();
        System.out.println("Sending Email");
    }
   public void status() {
        System.out.println("Email delivered");
    }

}
