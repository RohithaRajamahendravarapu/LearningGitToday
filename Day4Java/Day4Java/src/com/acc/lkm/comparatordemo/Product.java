package com.acc.lkm.comparatordemo;
import java.util.*;
public class Product implements Comparator<Product>{
	int product_id;
	String product_name;
	double price;

	public Product(int product_id, String product_name, double price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
	}

	@Override
	public int compare(Product prod1, Product prod2) {
		Product price1=(Product)prod1;
		Product price2=(Product)prod2;
		//Comparing two prices
		if(price1.price>price2.price) {
			return -1; //will swap
		}
		else if(price1.price<price2.price) {
		return 1; //will not swap
	}
	else {
		return 0;
	}

}}
