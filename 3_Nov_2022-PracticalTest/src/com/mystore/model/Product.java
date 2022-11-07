package com.mystore.model;

public class Product {
	int productId;
	String productName;
	double productPrice;
	
	public Product(){
		System.out.println("Constructor  Without Paarameter");
	}
	
	public Product(int pid,String pname,double pprice){
		productId=pid;
		productName=pname;
		productPrice=pprice;
	}
	
	public Product(int pid){
		productId=pid;
	}
	
	public Product(String pname){
		productName=pname;
	}
	
	public Product(double pprice){
		productPrice=pprice;
		}
	
	public void setProductId(int pid) {
		productId=pid;
	}
	
	public void setProductPrice(double pprice) {
		productPrice=pprice;
	}
	
	public void setProductName(String pname) {
		productName=pname;
	}
	
	public int getProductId() {
	  return productId;
	}
	
	public String getProductName() {
		  return productName;
		}
	
	public double getProductPrice() {
		  return productPrice;
		}

}
