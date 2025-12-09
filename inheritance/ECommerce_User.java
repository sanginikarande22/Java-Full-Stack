package inheritance;

public class ECommerce_User {
	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.login();
		a.searchProduct();
		a.primeMembership();

		Flipkart f = new Flipkart();
		f.login();
		f.placeOrder();
		f.exchangeOffer();

	}
}
