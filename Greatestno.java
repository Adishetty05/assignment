package com.sonata1;

public class Greatestno {
public static void main(String[] arg) {
int num1=12,num2=25,num3=89;
/*checks if num1 is greater than other 2 numbers*/
if(num1>=num2&& num1>=num3)
	System.out.println(num1+ "is the greatest number");
/*checks if num2 is greater than other 2 numbers*/
	else if(num2>=num1&& num2>=num3)
	System.out.println(num2+" is the greatest number");
	else
	System.out.println(num3+" is the greatest number");	
	}
	}

