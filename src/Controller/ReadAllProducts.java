package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Database;
import Model.Product;

public class ReadAllProducts {
	private Product p;
	private ArrayList<Product> products;
	public ReadAllProducts(Database database) {
		String select="SELECT * FROM `products`;";
		products=new ArrayList<Product>();
		//ReadAllSections sections=new ReadAllSections(database);
		//ArrayList<Integer> sectionIDs=sections.getIDs();
		//ArrayList<Section> sectionsList=sections.getList();
		try {
			ResultSet rs=database.getStatement().executeQuery(select);
			while(rs.next()) {
				p=new Product();
				p.setID(rs.getInt("ID"));
				p.setName(rs.getString("Name"));
				p.setDescription(rs.getString("Description"));
				p.setPrice(rs.getDouble("Price"));
				p.setQty(rs.getInt("Qty"));
				products.add(p);
			}
		}catch (SQLException exception) {
			exception.printStackTrace();
		}
	}
	public void print() {
		for(Product p:products) {
			p.print();
		}
		System.out.println("------------------------");
		
	}
	public ArrayList<Integer> getIDs(){
		ArrayList<Integer> IDs=new ArrayList<Integer>();
		for(Product p:products) {
			IDs.add(p.getID());
		}
		return IDs;
	}
}
