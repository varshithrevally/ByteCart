package View;

import java.util.Scanner;

import Model.Database;
import Model.Employee;
import Model.Option;
import Model.Receipt;

public class ReadAllReceipts implements Option{

	@Override
	public void oper(Employee user, Scanner s, Database database) {
		System.out.println("-----------------------------------------------");
		System.out.println("ID\tCashier\t\tTotal\tPayment\tPaid\tChange");
		for(Receipt r: new Controller.ReadAllReceipts(database).getReceipts()) {
			 if (r.getCashier() != null) {
			System.out.print(r.getID()+"\t"+r.getCashier().getName()+"\t");
			if(r.getCashier().getName().length()<8) {
				System.out.println("\t");
			}
			System.out.print(r.getTotal()+"$\t"+r.getPaymentToString()
		    +"\t"+r.getPaid()+"$\t"+r.getChange()+"$");
			 }
		}
		System.out.println("-----------------------------------------------");
	}

	@Override
	public String getOption() {
		return "View All Receipts";
	}

}
