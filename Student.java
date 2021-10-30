package com.sonata2;

public class Student {
int stdID;
String stdName;
double stdClass;

public void display() {
	System.out.println(stdID);
	System.out.println(stdName);
	System.out.println(stdClass);
}
public static void main(String args[]) {
Student s1 = new Student();
s1.stdID = 123;
s1.stdName= "adithi";
s1.stdClass = 10;
s1.display();

Student s2 = new Student();
s2.stdID = 223;
s2.stdName= "adithis";
s2.stdClass = 11;
s2.display();
}
}