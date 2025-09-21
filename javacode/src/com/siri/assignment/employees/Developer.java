package com.siri.assignment.employees;

public class Developer extends Employee {
	public String programmingLanguage;

    public Developer(String name, int employeeId, double salary, String department, String programmingLanguage) {
        super(name, employeeId, salary, department);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }


}
