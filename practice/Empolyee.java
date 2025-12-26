package practice;

public class Empolyee extends Person {
	double salary;

	Empolyee(String name, int age, double salary) {
		super(name ,age);
		this.salary=salary;
	}
	void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
	 public static void main(String[] args) {
		 Empolyee e=new Empolyee("Sangini" ,21,50000);
		 e.display();
	}

}
