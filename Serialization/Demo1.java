package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1 {
public static void main(String[] args) throws Exception {
	
	
	Employee e=new Employee(123,"sangini", "pune");
	
	
	FileOutputStream fos= new FileOutputStream("C:\\Users\\dell\\OneDrive\\Desktop\\employee.ser");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	
	
	oos.writeObject(e);
	fos.close();
	oos.close();
	System.out.println("File is successfully created..!!");
	

}
}
