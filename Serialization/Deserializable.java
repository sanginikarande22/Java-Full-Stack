package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializable {

		public static void main(String[] args) throws Exception {

			FileInputStream file = new FileInputStream("C:\\Users\\dell\\OneDrive\\Desktop\\employee.ser");
			ObjectInputStream ois = new ObjectInputStream(file);

			Employee e = (Employee) ois.readObject();

			System.out.println(e.empId + "   " + e.empName + "    " + e.city);

			ois.close();
			file.close();
		}

	}
