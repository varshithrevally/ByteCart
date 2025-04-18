package Model;


import View.ChangePassword;

public class Cashier extends Employee {
    public Cashier() {
    	generateList();
    }
	public Cashier(int ID,String firstName,String lastName,String email,String phoneNumber,String address,String password,double salary) {
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
				new ChangePassword()
			};
	}
	@Override
	public int getDepartment() {
		return 1;
	}
	
}
