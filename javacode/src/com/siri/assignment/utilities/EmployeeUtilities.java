package com.siri.assignment.utilities;
import com.siri.assignment.employees.*;

public class EmployeeUtilities {
	public void printEmployeeDetails(Employee e) {
        System.out.println("---- Employee Details ----");
        e.displayInfo();
        System.out.println("--------------------------");
    }

    public void testAccess(Employee e) {
        
        System.out.println("Public name: " + e.name);

        
        System.out.println("Protected ID: " + e.employeeId);

        
        System.out.println("Department: " + e.department);

    }


}
