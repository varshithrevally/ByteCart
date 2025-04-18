package View;

import java.util.Scanner;

import Controller.ReadAllEmployees;
import Controller.ReadEmployee;
import Model.Database;
import Model.Employee;
import Model.Option;

public class UpdateEmployee implements Option {

	@Override
	public void oper(Employee user, Scanner s, Database database) {
		System.out.println("Enter employee ID(-1 to show all Employees):");
		int ID=s.nextInt();
		while(ID<0) {
			new ReadAllEmployees(database).print();
			System.out.println("Enter employee ID(-1 to show all Employees):");
			ID=s.nextInt();
		}
		Employee emp=new ReadEmployee(ID, database).getEmployee();
		System.out.println("Enter first name(-1 to keep "+emp.getFirstName()+"):");
		String firstName=s.next();
		if(!firstName.equals("-1")) {
			emp.setFirstName(firstName);
		}
		System.out.println("Enter last name(-1 to keep "+emp.getLastName()+"):");
		String lastName=s.next();
		if(!lastName.equals("-1")) {
			emp.setLastName(lastName);
		}
		System.out.println("Enter email(-1 to keep "+emp.getEmail()+"):");
		String email=s.next();
		if(!email.equals("-1")) {
			emp.setEmail(email);
		}
		System.out.println("Enter phone number(-1 to keep "+emp.getPhoneNumber()+"):");
		String phonenumber=s.next();
		if(!phonenumber.equals("-1")) {
			emp.setPhoneNumber(phonenumber);
		}
		System.out.println("Enter Address(-1 to keep "+emp.getAddress()+"):");
		String address=s.next();
		if(!address.equals("-1")) {
			emp.setAddress(address);
		}
		System.out.println("Enter Salary(-1 to keep "+emp.getSalary()+"):");
		double salary=s.nextDouble();
		if(salary!=-1) {
			emp.setSalary(salary);
		}
		new Controller.UpdateEmployee(emp,database);
	}

	@Override
	public String getOption() {
		return "Update Employee's data";
	}

}
