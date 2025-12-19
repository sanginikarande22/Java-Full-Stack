package reference;

public class App2 {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        b.interest();
        b.loan();

        b = new HDFC();
        b.interest();
        b.loan();

    }
}