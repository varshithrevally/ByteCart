package View;

import java.util.Scanner;

import Model.Admin;
import Model.Cashier;
import Model.Database;
import Model.Employee;
import Model.Option;
import Model.Storekeeper;

public class CreateEmployee implements Option{

	public void oper(Employee user, Scanner s, Database database) {
		System.out.println("Enter first name: ");
		String firstName=s.next();
		System.out.println("Enter last name: ");
		String lastName=s.next();
		System.out.println("Enter Email: ");
		String email=s.next();
		System.out.println("Enter phone number: ");
		String phoneNumber=s.next();
		System.out.println("Enter Address: ");
		String address=s.next();
		System.out.println("Enter salary(double): ");
		double salary=s.nextDouble();
		System.out.println("Enter password: ");
		String password=s.next();
		System.out.println("Enter Department: (0.Admin 1.Cashier 2.StoreKeeper)");
		int department=s.nextInt();
		
		Employee e;
		switch(department) {
		case 0:
			e=new Admin();
			break;
		case 1:
			e=new Cashier();
			break;
		case 2:
			e=new Storekeeper();
			break;
			default:
				System.out.println("Invalid Department");
				e=new Cashier();
				break;
		}
		e.setFirstName(firstName);
		e.setLastName(lastName);
		e.setPhoneNumber(phoneNumber);
		e.setAddress(address);
		e.setPassword(password);
		e.setSalary(salary);
		
		new Controller.CreateEmployee(e, database);
	}

}
