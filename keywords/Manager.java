package keywords;

public class Manager extends Employee {
    int salary = 50000;

    Manager() {
        super(30000);     // parent constructor
    }

    void show() {
        super.show();    // parent method
        System.out.println("Manager Salary: " + this.salary);
        System.out.println("Employee Salary: " + super.salary);
    }
    public static void main(String[] args) {
        Manager m = new Manager();
        m.show();
    }
}
