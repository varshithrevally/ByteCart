package Model;


import View.ChangePassword;
import View.CreateReceipt;
import View.DeleteReceipt;
import View.ReadAllReceipts;
import View.ReadCashierReceipts;
import View.ReadMyReceipts;
import View.ReadReceipt;

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
				new CreateReceipt(),
				new ReadAllReceipts(),
				new ReadMyReceipts(),
				new ReadCashierReceipts(),
				new ReadReceipt(),
				new DeleteReceipt(),
				new ChangePassword()
			};
	}
	@Override
	public int getDepartment() {
		return 1;
	}
	
}
