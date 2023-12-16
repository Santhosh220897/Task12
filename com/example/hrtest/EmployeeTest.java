package com.example.hrtest;

//Package2-com.example.hrtest & class2-EmployeeTest

//Importing package1 & class1

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		// object creation for the class

		Employee details = new Employee();

		// Initializing the variables

		details.name = "Santhosh";
		details.id = 1001;
		details.salary = 28000.00;

		// calling the methods

		details.printName();
		details.printSalary();

	}

}

//Output:
/*  Employee Name: Santhosh
    Employee Salary: 28000.0 */


