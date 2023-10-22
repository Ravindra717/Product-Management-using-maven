package productservice.java;

import java.util.ArrayList;
import java.util.List;

import Productdb.java.Database;
import product.java.product;


public class productService {
List<product> products=new ArrayList<product>();
	
	Database db=new Database();
	
	public void addproducts(product p) {
//		products.add(p);
		db.save(p);
		
	}

	public List<product> getAllProducts() {
//		return products;
		return db.getAll();
	}

	public product getProduct(String name) {
		for(product p:products) {
			if(p.getName().equals(name))
			return p;
		}
		return null;
		
	}

	public product getProductByPlace(String place) {
		for(product p:products) {
			if(p.getPlace().equals(place))
			return p;
		}
		return null;
	}

	public List<product> getProductsByWarranty(int Int) {
		List<product> list=new ArrayList<product>();
		for(product p:products) {
			if(p.getWarranty()<=Int) {
				list.add(p);
			}
		}
		return list;
	}

	public List<product> getProductWithText(String text ) {
		String str=text.toLowerCase();
		List<product> prod=new ArrayList<product>();
		for(product pro:products) {
			String name=pro.getName().toLowerCase();
			String place=pro.getPlace().toLowerCase();
			String type=pro.getType().toLowerCase();
			if(name.contains(str)|| type.contains(str)||place.contains(str))
				prod.add(pro);
		}
		return prod;
	}

}
