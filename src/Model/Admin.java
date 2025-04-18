package Model;

import java.util.Scanner;

import View.CreateEmployee;

public class Admin extends Employee{
    public Admin() {
		this.options=new Option[] {
			new CreateEmployee()
		};
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
		this.options=new Option[] {
			new CreateEmployee()
		};
	}
	@Override
	public int getDepartment() {
		return 0;
	}
	@Override
	public void showList(Scanner s,Database database) {
		System.out.println();
		for(int i=1;i<=options.length;i++) {
			System.out.println(i+". "+options[i-1].getOption());
		}
		System.out.println();
		int selected=s.nextInt();
		options[selected-1].oper(this, s, database);
	}
}
