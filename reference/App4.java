package reference;

public class App4 {

    public static void main(String[] args) {

        Employee e;  

        e = new Manager();
        e.work("Rahul");
        e.salary(60000);

        e = new Tester();
        e.work("Suresh");
        e.salary(40000);
    }
}
