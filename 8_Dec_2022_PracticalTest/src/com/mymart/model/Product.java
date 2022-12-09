
package com.mymart.model;

public class Product {
	int productId;                   //variable declaration
	String productName;
	double productPrice;
	
	 Product(int productId,String productName,Double productPrice){         //constructor
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
		
		
	}
	//Setter methods
	public void setproductId(int pid) {
		productId=pid;
		
	}
	public void setproductName(String pname) {
		productName=pname;
	}
	public void setproductPrice(Double pprice) {
		productPrice=pprice;
	}
	
	//getter methods
	public int getproductId() {
	return	productId;
		
	}
	public String getproductName() {
	return productName;
	}
	public double setproductPrice() {
		return productPrice;
		
	}
	//override tostring method of string class
public String toString() {
	return this.productName;
}
//override equals method of string class
public boolean equals(Object obj) {
    if (obj == this) 
       return true;
	return true;

}
//override hashcode method of string class
@Override
public int hashCode() {
    int result = 20;
    
    result = 50 * result + productId;
    result = 30 * result + productName.hashCode();
    return result;
}


}

