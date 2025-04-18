package Model;

import java.util.Scanner;

public class Storekeeper extends Employee{
    public Storekeeper() {
    	this.options=new Option[] {};
	}
	public Storekeeper(int ID,String firstName,String lastName,String email,String phoneNumber,String address,String password,double salary) {
		this.ID=ID;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.password = password;
		this.salary=salary;
		this.options=new Option[] {};
	}
	@Override
	public int getDepartment() {
		return 2;
	}
	@Override
	public void showList(Scanner s,Database database) {
		System.out.println("Store Keeper List");
	}
}
