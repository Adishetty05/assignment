package com.sonata.override;
import com.sonata.override.Employee;
import com.sonata.override.EmployeeImp1;
public class UserEmployee extends Employee {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEmployeeID(123);
		e1.setEmployeeName("Adithi");
		e1.setEmployeeSalary(25677);
		
		Employee e2=new Employee();
		e2.setEmployeeID(124);
		e2.setEmployeeName("Anudha");
		e2.setEmployeeSalary(24567);
		
		EmployeeImp1 l1=new EmployeeImp1();
		l1.addEmployee(e1);
		l1.addEmployee(e2);
		System.out.println(l1.getEmployee());
		System.out.println(l1);
	}

}
