package abstraction;


	public class User implements ATM {

	    public void withdraw() {
	        System.out.println("Withdraw limit is: " + limit);
	    }

	    public static void main(String[] args) {
	        User u = new User();
	        u.withdraw();
	    }
	}
