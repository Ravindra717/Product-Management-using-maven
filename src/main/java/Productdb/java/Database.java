package Productdb.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import product.java.product;

public class Database {
	Connection con=null;
	
	public Database() {
		try {
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProductManagement", "postgres", "1717");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

	

	public void save(product p){
		String Query="insert into product(name,type,place,warranty)values(?,?,?,?)";
		try {
			PreparedStatement statement = con.prepareStatement(Query);
			statement.setString(1, p.getName());
			statement.setString(2, p.getType());
			statement.setString(3, p.getPlace());
			statement.setInt(4, p.getWarranty());
			statement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}




	public List<product> getAll() {
		List<product> products=new ArrayList<>();
		String Query="select name,type,place,warranty from product";
		try {
			PreparedStatement ps = con.prepareStatement(Query);
			ResultSet set = ps.executeQuery();
			while(set.next()) {
				product p=new product();
				p.setName(set.getString(1));
				p.setType(set.getString(2));
				p.setPlace(set.getString(3));
				p.setWarranty(set.getInt(4));
				products.add(p);
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return products;
	}

}
