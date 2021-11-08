package com.sonata.override;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class TestStudent {
	public static void main(String[] args) 
	{
		 
		
		List<Student> studentlist=new ArrayList<Student>();
	     studentlist.add(new Student("Adithi",123,90));
	     studentlist.add(new Student("Anudha",125,100));
	     studentlist.add(new Student("Aishwarya",124,95));
	     studentlist.add(new Student("Kirthana",126,92));
	     studentlist.add(new Student("Shivani",127,99));
	     System.out.println("Before sorting : ");
	     //forEach for printing the list
	     studentlist.forEach((s)->System.out.println(s));
	     System.out.println("After sorting : ");
	     
	     studentlist.sort((Student s1,Student s2)->s2.getStdid()-s1.getStdid());
	    studentlist.sort((Student s1,Student s2)->s2.getStdmarks()-s1.getStdmarks());
	     studentlist.forEach((s)->System.out.println(s));
	    
	}
}
