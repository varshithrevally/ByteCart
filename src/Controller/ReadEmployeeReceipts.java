package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Database;
import Model.Employee;
import Model.Receipt;

public class ReadEmployeeReceipts {
	private ArrayList<Receipt> receipts;
	public ReadEmployeeReceipts(int ID,Database database) {
		Employee cashier=new ReadEmployee(ID, database).getEmployee();
		String select="SELECT * FROM `receipts` WHERE `Cashier`="+ID+";";
		receipts = new ArrayList<>();
		try {
			ResultSet rs = database.getStatement().executeQuery(select);
			while(rs.next()) {
				Receipt r = new Receipt();
				r.setID(rs.getInt("ID"));
				r.setCashier(cashier);
				r.setTotal(rs.getDouble("Total"));
				r.setPayment(rs.getInt("Payment"));
				r.setPaid(rs.getDouble("Paid"));
				r.setChange(rs.getDouble("Changee"));
				receipts.add(r);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for (int i=0;i<receipts.size();i++) {
			receipts.get(i).setProducts(new ReadReceiptProducts(receipts.get(i).getID(), database).getProducts());
		}
	}
	public ArrayList<Receipt> getReceipts(){
		return receipts;
	}
	public void print() {
		System.out.println("-----------------------------------------------");
		System.out.println("ID\tCashier\t\tTotal\tPayment\tPaid\tChange");
		for(Receipt r: receipts) {
			 if (r.getCashier() != null) {
			System.out.print(r.getID()+"\t"+r.getCashier().getName()+"\t");
			if(r.getCashier().getName().length()<8) {
				System.out.println("\t");
			}
			System.out.println(r.getTotal()+"$\t"+r.getPaymentToString()
		    +"\t"+r.getPaid()+"$\t"+r.getChange()+"$");
			 }
		}
		System.out.println("-----------------------------------------------");
	}
}
