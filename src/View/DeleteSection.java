package View;

import java.util.Scanner;

import Controller.ReadAllSections;
import Model.Database;
import Model.Employee;
import Model.Option;

public class DeleteSection implements Option {

	@Override
	public void oper(Employee user, Scanner s, Database database) {
		System.out.println("Enter section ID(-1 to show all sections):");
		int ID=s.nextInt();
		while(ID<0) {
			new ReadAllSections(database).print();
			System.out.println("Enter section ID(-1 to show all sections):");
			ID=s.nextInt();
		}
		new Controller.DeleteSection(ID, database);
	}

	@Override
	public String getOption() {
		return "Remove Section";
	}

}
