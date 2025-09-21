package com.siri.assignment.employees;

public class Employee {

	public String name;

	    
	    public int employeeId;

	    
	    private double salary;

	    public String department;

	    
	    public Employee(String name, int employeeId, double salary, String department) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	        this.department = department;
	    }

	   
	    public void displayInfo() {
	        System.out.println("Name: " + name +
	                           ", ID: " + employeeId +
	                           ", Salary: " + salary +
	                           ", Department: " + department);
	    }
}




