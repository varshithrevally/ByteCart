package Controller;

import java.sql.SQLException;

import Model.Database;

public class DeleteSection {
	public DeleteSection(int ID,Database database) {
		String delete="DELETE FROM `sections` WHERE `ID`='"+ID+"';";
		try {
			database.getStatement().execute(delete);
			System.out.println("Section Deleted Succesfully!");
		}catch(SQLException exception) {
			exception.printStackTrace();
		}
	}
}
