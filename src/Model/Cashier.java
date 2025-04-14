package Model;

public class Cashier extends Employee {
    public Cashier() {
    	this.options=new Option[] {};
	}
	public Cashier(int ID,String firstName,String lastName,String email,String phoneNumber,String address,double salary) {
		this.ID=ID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.salary=salary;
		this.options=new Option[] {};
	}
}
