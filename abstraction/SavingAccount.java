package abstraction;

public class SavingAccount implements Account {

    public int getBalance() {
        return minBalance + 5000;
    }

    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        System.out.println("Balance = " + s.getBalance());
    }
}