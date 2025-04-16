package Supermarket;

import Controller.CreateEmployee;
import Model.Admin;
import Model.Database;
import Model.Employee;

public class Main {
	public static void main(String[] args) {
		Employee admin=new Admin(0, "Admin","0", "admin0@supermarket.com", "000000", 
				"Address 0", "0000", 1000);
		Database database=new Database();
		new CreateEmployee(admin, database);
		
	}
}
