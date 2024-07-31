package com.acc.lkm.comparatordemo;
import java.util.*;
public class ProductUI {

	public static void main(String[] args) {
		List<Product>prodList=new ArrayList<>();
		prodList.add(new Product(34, "SmartPhone", 65000.00));
		prodList.add(new Product(13, "Grocery", 20000.00));
		prodList.add(new Product(82, "Books", 90000.00));
		//Price Comparison
		System.out.println("Comparing Prices of Product:");
		Collections.sort(prodList,new Product(0, null, 0.0));
		for(Product p1:prodList) {
			System.out.println("Product ID is:"+p1.product_id+
					"\n"+"Product name is:"+p1.product_name+
					"\n"+"Price is:"+p1.price);
		}

	}

}
