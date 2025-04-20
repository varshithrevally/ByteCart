package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Database;
import Model.Section;

public class ReadSection {
	private Section section;
	public ReadSection(int ID,Database database) {
		String select="SELECT * FROM `sections` WHERE `ID`='"+ID+"';";
		try {
			ResultSet rs=database.getStatement().executeQuery(select);
			rs.next();
			String name=rs.getString("Name");
			String description=rs.getString("Description");
			section=new Section();
			section.setID(ID);
			section.setName(name);
			section.setDescription(description);
		}catch (SQLException exception) {
			exception.printStackTrace();
		}
	}
	public Section getSection() {
		return section;
	}
	public void printSection() {
		section.print();
	}
}
