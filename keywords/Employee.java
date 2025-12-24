package keywords;

public class Employee {
	int salary = 30000;

    Employee(int salary) {
        this.salary = salary;
    }

    void show() {
        System.out.println("Employee Salary: " + salary);
    }
}
