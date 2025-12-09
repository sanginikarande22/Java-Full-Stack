package inheritance;

public class Bank_User {
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.deposit();
		s.withdraw();
		s.addInterest();

		CurrentAccount c = new CurrentAccount();
		c.deposit();
		c.overdraft();
		c.issueCheque();
	}
}
