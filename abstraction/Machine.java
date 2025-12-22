package abstraction;

public class Machine implements Printable, Scannable{
	public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }


    public static void main(String[] args) {

        Machine m = new Machine();   

        m.print();   
        m.scan();    
    }
}
