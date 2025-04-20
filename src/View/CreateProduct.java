package View;

import java.util.Scanner;

import Controller.ReadAllSections;
import Model.Database;
import Model.Employee;
import Model.Option;
import Model.Product;

public class CreateProduct implements Option {

	@Override
	public void oper(Employee user, Scanner s, Database database) {
		Product product=new Product();
		System.out.println("Enter name: ");
		product.setName(s.next());
		System.out.println("Enter Description: ");
		product.setDescription(s.next());
		System.out.println("Enter Price (double): ");
		product.setPrice(s.nextDouble());
		System.out.println("Enter Qty(int):");
		product.setQty(s.nextInt());
		System.out.println("Enter section ID(-1 to show all sections):");
		int sectionID=s.nextInt();
		ReadAllSections sections=new ReadAllSections(database);
		while(sectionID<0) {
			sections.print();;
			System.out.println("Enter section ID(-1 to show all sections):");
			sectionID=s.nextInt();
		}
		if(!sections.getIDs().contains(sectionID)) {
			System.out.println("Section Doesn't Exist!");
			return;
		}
		new Controller.CreateProduct(product, sectionID, database);
	}

	@Override
	public String getOption() {
		// TODO Auto-generated method stub
		return "Add new Product";
	}

}
