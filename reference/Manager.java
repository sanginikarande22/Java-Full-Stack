package reference;

public class Manager extends Employee {

    void work(String name) {
        System.out.println("Manager managing team: " + name);
    }

    void salary(double amount) {
        System.out.println("Manager salary: ₹" + amount);
    }
}