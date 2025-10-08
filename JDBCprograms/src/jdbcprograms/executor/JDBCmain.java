package jdbcprograms.executor;
import jdbcprograms.services.CurdOperations;


public class JDBCmain {

	public static void main(String[] args) {
		CurdOperations.addStudent(101, "Seetha");
		CurdOperations.addStudent(102, "Geetha");
		CurdOperations.addStudent(103, "Ramu");

	}

}
