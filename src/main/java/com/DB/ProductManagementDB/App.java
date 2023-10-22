package com.DB.ProductManagementDB;

import java.util.List;

import product.java.product;
import productservice.java.productService;

public class App 
{
    public static void main( String[] args )
    {
    productService service =new productService();
		
//		product p=new product("asus vBook","Laptop","Brown Table",2024);
//		product p1=new product("mac Book","Laptop","Brown Table",2028);
		
		service.addproducts(new product("asus vBook","Laptop","Brown Table",2024));
		service.addproducts(new product("mac Book","Laptop","white Table",2026));
		service.addproducts(new product("asus bag","bag","Table outside",2029));
		service.addproducts(new product("spects","googles","Brown Table",0));
		service.addproducts(new product("ipad","phone","yellow Table",2052));
		service.addproducts(new product("iphone charger","charger","Table no-10",2012));
		service.addproducts(new product("c type charger","charger","Table no-10",2012));
		service.addproducts(new product("personal dairy","notes","Table no-5",2024));
		service.addproducts(new product("mac mouse","mouse","Table no-2",2028));
		
		List<product> products=service.getAllProducts();
			for(product p :products) {
				System.out.println(p);
			}
//			System.out.println("##################################################");
//			 
//		
//		
////		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter the product name");
////		String name=scanner.nextLine();
//		product p =service.getProduct("ipad");
//		System.out.println(p);
//		
//		
//		System.out.println("#####################################################");
//		
//		
//		System.out.println("enter the product place");
//		product p1=service.getProductByPlace("Table no-2");
//		System.out.println(p1);
//		
//		System.out.println("#####################################################");
//		
//		System.out.println("enter the details");
//		List<product> p2=service .getProductsByWarranty(2024);
//		System.out.println(p2);
//		
//		System.out.println("#####################################################");
//		System.out.println("a particular text products");
//		List<product> p3=service.getProductWithText("Table no-10");
//			for(product pro:p3) {
//				System.out.println(pro);
//			}
    }
}
