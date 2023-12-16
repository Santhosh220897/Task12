package task12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {

		// Importing ArrayList & List

		List<String> listobj = new ArrayList<String>();

		// Storing the String data in variable using add command;

		listobj.add("hi all");
		listobj.add("My name is Santhosh");
		listobj.add("Welcome to Guvi");
		listobj.add("Lets begin..");
		listobj.add("hi everyone");

		// Iterator method is used for execution of program;

		Iterator<String> i = listobj.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());
		}

		// Remove command is used to remove the elements by each index-Method1

		listobj.remove(0);
		listobj.remove(1);

		System.out.println("By using Remove Command & Get Command : " + listobj.get(2));

		// Clear Command is used to clear all the data stored in string-Method2

		listobj.clear();

		System.out.println("By using Clear Command :" + listobj);

	}
}

//Output:
/* hi all
   My name is Santhosh
   Welcome to Guvi
   Lets begin..
   hi everyone
   By using Remove Command & Get Command : hi everyone
   By using Clear Command :[]                          */

