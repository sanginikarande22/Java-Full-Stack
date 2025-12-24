package keywords;

public class Final_Ex {
	final int accountNo;
	final String bankName = "SBI";

	Final_Ex(int accountNo) {
		this.accountNo = accountNo;
	}

	final void showDetails() {
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account No: " + accountNo);
	}

	public static void main(String[] args) {
		Final_Ex b = new Final_Ex(12345);
		b.showDetails();
	}
}