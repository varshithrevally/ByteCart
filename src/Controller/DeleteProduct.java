package Controller;

import java.sql.SQLException;

import Model.Database;

public class DeleteProduct {
	public DeleteProduct(int ID,Database database) {
		String delete="DELETE FROM `products` WHERE `ID`='"+ID+"';";
		try {
			database.getStatement().execute(delete);
			System.out.println("Product Deleted Succesfully!");
		}catch(SQLException exception) {
			exception.printStackTrace();
		}
	}
}
