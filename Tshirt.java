package com.sonata2;

public class Tshirt {
String color;
String material;
String design;

public Tshirt(String color, String material, String design) {
	this.color = color;
	this.material = material;
	this.design = design;
	
}
public String Design() {
	return design;
	
}

//main method
public static void main(String args[]) {
	Tshirt t1= new Tshirt("BLUE","COTTON","small");
	Tshirt t2= new Tshirt("BLUE","COTTON","large");
	Tshirt t3= new Tshirt("BLUE","COTTON","xtra-large");
	
	System.out.println(t1.Design());
	System.out.println(t2.Design());
	System.out.println(t3.Design());
	
}
}
