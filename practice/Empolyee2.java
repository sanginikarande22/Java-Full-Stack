package practice;



public class Empolyee2{
	
	int id;
	String name;
	Address address;
	
	Empolyee2(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
	}
	
	
	
	void showDetails() {
		System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("City: " + address.city);
        System.out.println("State: " + address.state);
    }

}
