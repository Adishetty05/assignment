package com.sonata2;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		Sedan s1 = new Sedan(90,400000,"black",35);
		double saleprice = s1.getSalePrice();
		s1.display();
		System.out.println("salesprice:"+saleprice);
		System.out.println();
		
		Ford f1 = new Ford(90,300000,"black",1999,20);
		double salepriceFord=f1.getSalePrice();
		f1.display();
		System.out.println("salesprice:"+salepriceFord);
		System.out.println();
		
		Ford f2 = new Ford(80,40000,"white",1998,14);
		double salepriceFord2=f2.getSalePrice();
		f2.display();
		System.out.println("salesprice:" +salepriceFord2);
		System.out.println();
		
		Car c1 = new Car(80, 300000 ,"white");
		double cprice=c1.getSalePrice();
		c1.display();
		System.out.println("salesprice:" +cprice);
		System.out.println();
		
		Truck t1 = new Truck(100, 100000, "brown", 400);
	    double tprice=t1.getSalePrice();
	    t1.display();
	    System.out.println("Sale Price : "+tprice);
	    System.out.println();
		
		
}
}
