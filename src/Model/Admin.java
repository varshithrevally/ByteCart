package Model;


import View.ChangePassword;
import View.CreateEmployee;

public class Admin extends Employee{
    public Admin() {
    	generateList();
	}
	
	public Admin(int ID,String firstName,String lastName,String email,String phoneNumber,String address,String password,double salary) {
		this.ID=ID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.password = password;
		this.salary=salary;
		generateList();
	}
	private void generateList() {
		this.options=new Option[] {
				new CreateEmployee(),
				new ChangePassword()
			};
	}
	@Override
	public int getDepartment() {
		return 0;
	}
	
}
