package Controller;

import java.sql.SQLException;

import Model.Database;
import Model.Employee;

public class UpdateEmployee {
	public UpdateEmployee(Employee e,Database database) {
		String update="UPDATE `employees` SET `FirstName`='"+e.getFirstName()+"',`LastName`='"+e.getLastName()+"',"
		+ "`Email`='"+e.getEmail()+"',`PhoneNumber`='"+e.getPhoneNumber()+"',`Address`='"+e.getAddress()+"',"
		+ "`Salary`='"+e.getSalary()+"',"
				+ "`Password`='"+e.getPassword()+"' WHERE `ID`= "+e.getID()+";";
		try {
			database.getStatement().execute(update);
			System.out.println("Employee Updated Succesfully!");
		}catch(SQLException exception) {
			exception.printStackTrace();
		}
	}
}
