package combination;

public class Employee {
	private int empid;
	private double salary;

	Employee(int empid, double salary) {
		this.empid = empid;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public double getSalary() {
		return salary;
	}

	void DisplayEmployee() {
		System.out.println("Empolyee id: " + empid);
		System.out.println("Salary: " + salary);
		
	}

}