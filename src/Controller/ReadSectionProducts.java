package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Database;
import Model.Product;

public class ReadSectionProducts {
	private Product p;
	private ArrayList<Product> products;
	public ReadSectionProducts(int section,Database database) {
		String select="SELECT * FROM `products` WHERE `Section`='"+section+"';";
		products=new ArrayList<Product>();
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
	public ArrayList<Product> getProducts(){
		return products;
	}

}