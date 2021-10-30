package com.sonata2;

public class Car {
int speed;
double regularPrice;
String color;

Car(){};

Car(int speed, double regularPrice, String color)
{
	this.speed=speed;
	this.regularPrice= regularPrice;
	this.color=color;
}

double getSalePrice() {
	return regularPrice;
}

public void display() {
	System.out.println(speed);
	System.out.println(regularPrice);
	System.out.println(color);
	
}
public static void main(String args[]) {
	Car c1 = new Car(80, 300000 ,"white");
	c1.display();
	

}
}
