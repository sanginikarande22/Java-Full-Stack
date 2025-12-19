package reference;

public class App1 {
	public static void main(String[] args) {

		Notification n;

		n = new Email();
		n.send();
		n.status();

		n = new Whatsapp();
		n.send();
		n.status();
	}
}
