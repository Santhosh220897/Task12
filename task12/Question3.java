package task12;

import java.util.Map;
import java.util.TreeMap;

public class Question3 {

	public static void main(String[] args) {

		// Importing TreeMap & Map

		Map<Integer, String> employee = new TreeMap<Integer, String>();

		// Storing Employee Name & Id in Variable employee using Put command;

		employee.put(1234, "Santhosh");
		employee.put(1235, "Suresh");
		employee.put(1232, "Ramesh");
		employee.put(1231, "Abinash");

		// Using For each loop to print the employee details in Alphabetical order

		for (Map.Entry<Integer, String> details : employee.entrySet()) {

			System.out.println(details);

		}

	}

}

//Output

/* 1231=Abinash
   1232=Ramesh
   1234=Santhosh
   1235=Suresh   */


