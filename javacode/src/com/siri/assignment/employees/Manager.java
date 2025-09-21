package com.siri.assignment.employees;

public class Manager extends Employee {
	int teamSize;

    public Manager(String name, int employeeId, double salary, String department, int teamSize) {
        super(name, employeeId, salary, department);
        this.teamSize = teamSize;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }

}
