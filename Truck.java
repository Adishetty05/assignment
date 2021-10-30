package com.sonata2;

public class Truck extends Car {
int weight;

Truck(){};
Truck(int speed,double regularPrice,String color,int weight)
{
	super(speed,regularPrice,color);
	this.weight=weight;
}
double getSalePrice() {
	if(weight>2000)
		return regularPrice-((regularPrice*10)/100);
	return regularPrice-((regularPrice*20)/100);
}

public void display() {
	super.display();
	System.out.println(weight);
}
public static void main(String args[]) {
	Truck t1 = new Truck(100, 100000, "brown", 400);
	t1.display();
	

}
}

