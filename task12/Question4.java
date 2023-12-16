package task12;

import java.util.ArrayList;
import java.util.List;

public class Question4 {

	public static void main(String[] args) {

		// Importing List & Array List

		List<String> arrayobj = new ArrayList<String>();

		// Storing the String Elements in variable by add command

		arrayobj.add("Hi all");
		arrayobj.add("Welcome to Jat14 batch");
		arrayobj.add("Lets begin..");

		// Converting list to Array

		String conArray[] = arrayobj.toArray(new String[0]);

		// Using ForEach loop for Printing.

		for (String i : conArray) {

			System.out.println(i);

		}

	}

}

//Output:

/* Hi all
   Welcome to Jat14 batch
   Lets begin..           */

