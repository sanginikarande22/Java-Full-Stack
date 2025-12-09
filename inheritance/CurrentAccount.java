package inheritance;

public class CurrentAccount extends BankAccount {
	void overdraft() {
		System.out.println("Overdraft facility");
	}
	void issueCheque() {
        System.out.println("Cheque issued");
    }
}
