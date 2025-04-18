package View;

import java.util.Scanner;

import Model.Database;
import Model.Employee;
import Model.Option;

public class Login implements Option{

	@Override
	public void oper(Employee user, Scanner s, Database database) {
		System.out.println("Welcome to SuperMarket Management System");
		System.out.println("Enter your email: ");
		String email=s.next();
		System.out.println("Enter your password: ");
		String password=s.next();
		Controller.Login login=new Controller.Login(email, password, database);
		if(login.isLoggedIn()) {
			Employee employee=login.getUser();
			System.out.println("Welcome"+employee.getFirstName());
			employee.showList();
		}else {
			System.out.println("Wrong email or pasword");
			System.out.println("Try again Later");
		}
	}

}
