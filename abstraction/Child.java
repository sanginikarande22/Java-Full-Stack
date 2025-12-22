package abstraction;

public class Child implements Father, Mother {

	public void surname() {
		System.out.println("Karande");
	}

	public void cocking() {
		System.out.println("Masala Bhat...");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.surname();
		c.cocking();
	}
}
