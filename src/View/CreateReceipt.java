package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.ReadAllSections;
import Controller.ReadProduct;
import Model.Database;
import Model.Employee;
import Model.Option;
import Model.Product;
import Model.Receipt;

public class CreateReceipt implements Option{

	@Override
	public void oper(Employee user, Scanner s, Database database) {
		System.out.println("Select Products then enter -1 to proceed to chechkout");
		ArrayList<Integer> IDs=new ArrayList<Integer>();
		ArrayList<Integer> Qtys=new ArrayList<Integer>();  

		ReadAllSections readsections=new ReadAllSections(database);
		int i;
		do {
			readsections.printWithProducts();
			i=s.nextInt();
			if(i>0) {
				IDs.add(i);
				System.out.println("Enter Quantities: ");
				Qtys.add(s.nextInt());
				System.out.println("------------------------");
			}
			
		}while(i>0);
		
		ArrayList<Product> products=new ArrayList<>();  
		for(int j=0;j<IDs.size();j++) {
			products.add(new ReadProduct(IDs.get(j), database).getProduct());
			products.get(j).setQty(Qtys.get(j));
		}
		double total=0;
		System.out.println("---------------------");
		System.out.println("Review Order: ");
		System.out.println("---------------------");
		for(Product p:products) {
			System.out.println(p.getName()+"\t"+p.getPrice()+"$\t"+p.getQty());
			total=total+p.getPrice()*p.getQty();
		}
		System.out.println("---------------------");
		System.out.println("Total= "+total+" $");
		System.out.println("---------------------");
		System.out.println("1. Continue\n2. Cancel");
		int cont=s.nextInt();
		if(cont!=1) {
			return;
		}
		System.out.println("Select Payment Type:\n1. Cash\n2. Visa");
		int payment=s.nextInt();
		while(payment<1 || payment>2) {
			System.out.println("Invalid Payment Method!");
			System.out.println("Select Payment Type:\n1. Cash\n2. Visa");
			payment=s.nextInt();
		}
		System.out.println("Enter paid: ");
		double paid=s.nextDouble();
		if(paid<total) {
			System.out.println("Invalid data");
			System.out.println("Enter paid: ");
			paid=s.nextDouble();
		}
		double change=paid-total;
		System.out.println("Change= "+change+" $");
		Receipt receipt=new Receipt();
		receipt.setCashier(user);
		receipt.setProducts(products);
		receipt.setTotal(total);
		receipt.setPayment(payment);
		receipt.setPaid(paid);
		receipt.setChange(change);
		
		new Controller.CreateReceipt(receipt, database);
	}

	@Override
	public String getOption() {
		// TODO Auto-generated method stub
		return "Create Receipt";
	}

}
