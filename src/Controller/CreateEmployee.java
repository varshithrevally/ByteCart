package Controller;

import java.sql.SQLException;

import Model.Database;
import Model.Employee;

public class CreateEmployee{
	public  CreateEmployee(Employee e,Database database) {
		String insert="INSERT INTO `employees`(`FirstName`, `LastName`, `Email`,"
				+ " `PhoneNumber`, `Address`, `Salary`, `Department`, `Password`)"
				+ " VALUES ('"+e.getFirstName()+"','"+e.getLastName()+"','"+e.getEmail()+"',"
				+ "'"+e.getPhoneNumber()+"','"+e.getAddress()+"','"+e.getSalary()+"',"
						+ "'"+e.getDepartment()+"','"+e.getPassword()+"');";
		try {
			database.getStatement().execute(insert);
			System.out.println("Employee Created Succesfully!");
		}catch(SQLException exception) {
			exception.printStackTrace();
		}
	}
}
