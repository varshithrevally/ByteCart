package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Database;
import Model.Product;

public class ReadProduct {
	private Product p;
	public ReadProduct(int ID,Database database) {
		String select="SELECT * FROM `products` WHERE `ID`='"+ID+"';";
		try {
			ResultSet rs=database.getStatement().executeQuery(select);
			while(rs.next()) {
				p=new Product();
				p.setID(rs.getInt("ID"));
				p.setName(rs.getString("Name"));
				p.setDescription(rs.getString("Description"));
				p.setPrice(rs.getDouble("Price"));
				p.setQty(rs.getInt("Qty"));
			}
		}catch (SQLException exception) {
			exception.printStackTrace();
		}
	}
	public Product getProduct() {
		return p;
	}
}
