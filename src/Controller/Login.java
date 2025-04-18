package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Admin;
import Model.Cashier;
import Model.Database;
import Model.Employee;
import Model.Storekeeper;

public class Login {
	private Employee employee;
	private boolean loggedIn;
	public Login(String email,String password,Database database) {
		String select="SELECT * FROM `employees` WHERE `Email`='"+email+"' AND `Password`='"+password+"';";
		try {
			ResultSet rs=database.getStatement().executeQuery(select);
			loggedIn=rs.next();
			if(loggedIn) {
				int ID=rs.getInt("ID");
				String firstName=rs.getString("FirstName");
				String lastName=rs.getString("LastName");
				String phoneNumber=rs.getString("PhoneNumber");
				String address=rs.getString("Address");
				double salary=rs.getDouble("Salary");
				int department=rs.getInt("Department");
				
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
				e.setID(ID);
				e.setFirstName(firstName);
				e.setLastName(lastName);
				e.setPhoneNumber(phoneNumber);
				e.setAddress(address);
				e.setPassword(password);
				e.setSalary(salary);
				this.employee=e;
			}
		}catch (SQLException exception) {
			exception.printStackTrace();
		}
	}
	public boolean isLoggedIn() {
		return loggedIn;
	}
	public Employee getUser(){
		return employee;
	}
}
