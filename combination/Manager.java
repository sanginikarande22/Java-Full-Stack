package combination;

public class Manager extends Employee {
	private double bonus;

	Manager(int empId, double salary, double bonus) {
		super(empId, salary);
		this.bonus = bonus;
	}

	void calculateTotalSalary() {
		double total = getSalary() + bonus;
		System.out.println("Total Salary: " + total);
	}
}
