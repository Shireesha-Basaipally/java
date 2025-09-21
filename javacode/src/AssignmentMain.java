import com.siri.assignment.employees.*;
import com.siri.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		Manager m = new Manager("Alice", 101, 75000, "HR", 5);
        Developer d = new Developer("Bob", 102, 65000, "IT", "Java");

        EmployeeUtilities util = new EmployeeUtilities();

        util.printEmployeeDetails(m);
        util.printEmployeeDetails(d);

        d.programmingLanguage = "Python";
        System.out.println("Updated Developer Language: " + d.programmingLanguage);

        m.employeeId = 201;
        System.out.println("Updated Manager ID: " + m.employeeId);

        m.department = "Finance";
        System.out.println("Updated Manager Department: " + m.department);

        util.printEmployeeDetails(m);
        util.printEmployeeDetails(d);
    }
	}


