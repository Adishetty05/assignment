package com.sonata2;

public class Sedan extends Car{
	 int length;
	 Sedan(){};
	 Sedan(int speed,double regularPrice,String color,int length)
	 {
		 super(speed,regularPrice,color);
		 this.length=length;
	 }
	 double SalePrice() {
		 super.getSalePrice();
		 if(length>20)
			 return regularPrice-((regularPrice*5)/100);
		 return regularPrice-((regularPrice*10)/100);
	 }
	 public void display() {
			super.display();
			System.out.println(length);
		}
	 public static void main(String args[]) {
			Sedan s1 = new Sedan(90,400000,"black",35);
			s1.display();
 }
}

