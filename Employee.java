package com.sonata.override;

public class Employee {
int EmployeeID;
String EmployeeName;
double EmployeeSalary;
public int getEmployeeID() {  
    return EmployeeID;  
}  
public void setEmployeeID(int EmployeeID) {  
    this.EmployeeID = EmployeeID;  
} 

public String getEmployeeName() {  
    return EmployeeName;  
}  
public void setEmployeeName(String EmployeeName) {  
    this.EmployeeName = EmployeeName;  }

public double getEmployeeSalary() {  
    return EmployeeSalary;  
}  
public void setEmployeeSalary(double EmployeeSalary) {  
    this.EmployeeSalary= EmployeeSalary;  
}  


//Overriding toString() method  
@Override  
public String toString() {  
    return "Employee [EmployeeID= " + EmployeeID + ",  EmployeeName = " + EmployeeName + ",EmployeeSalary = " + EmployeeSalary + "]";  
    }  
       
  
    //main method   
    public static void main(String args[]) {  
          
          
        Employee emp = new Employee();  
        
        emp.setEmployeeID(123);  
        emp.setEmployeeName("Adithi Shetty");   
        emp.setEmployeeSalary(25000);  
         
          
    
        System.out.println(emp);  
          
       
}
}
