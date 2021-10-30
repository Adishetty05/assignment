package com.sonata2;

public class Ford extends Car{
	int year;
	int manufacturerDiscount;
	Ford(){};
	Ford(int speed,double regularPrice,String color, int year, int manufacturerDiscount)
	{
		super(speed,regularPrice,color);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}
	double getSalePrice() {
		return regularPrice-((regularPrice*manufacturerDiscount)/100);
	}
	public void display() {
		super.display();
		System.out.println(year);
		System.out.println(manufacturerDiscount);
	}
	public static void main(String args[]) {
		Ford f1 = new Ford(90,300000,"black",1999,20);
		f1.display();
		
}
}
