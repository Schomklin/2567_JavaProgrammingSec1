
public class TestEmployee {
	public static void main(String[] args) {
		//Crate two Employee objects
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//Set employee details
		emp1.setEmployeeDetails("John", 45, 20.0);
		emp2.setEmployeeDetails("Jane", 38, 25.0);
		
		//Display employee details
		System.out.println("Employee 1 Details:");
		emp1.displayEmployeeDetails();
		
		System.out.println("\nEmployee 2 Details:");
		emp2.displayEmployeeDetails();
		
	}//end of main() Method
} //end of TestEmployee Class
