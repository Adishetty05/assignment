package com.sonata2;



public class Product {
	int ProID;
	String ProName;
	double ProPrice;
	
	Product(){}
	//parameter construtcor
	Product(int ID,String Name,double Price){
		this.ProID=ID;
		this.ProName=Name;
		this.ProPrice=Price;
	}
	
	
	public void display() {
		System.out.println(ProID);
		System.out.println(ProName);
		System.out.println(ProPrice);
	}
	public double TotalProPrice(double GST) {
		return this.ProPrice + 50;
		}
	
	public static void main(String args[]) {
		Product p1 = new Product(153, "dress" , 400);
		p1.display();
		System.out.println(p1.TotalProPrice(50));

}
}
