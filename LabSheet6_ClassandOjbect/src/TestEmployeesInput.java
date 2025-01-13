import java.util.*;
public class TestEmployeesInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Crate two Employee objects
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//Input for first employee
		System.out.println("Enter detail for Employee 1:");
		//กำหนดข้อความและตัวแปร
		System.out.print("Name: ");
		String empName1 = scan.nextLine(); 
		System.out.print("Hours Worked: ");
		int empHoursWorked1 = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double empHourlyRate1 = scan.nextDouble();
		
		//Set employee details
		emp1.setEmployeeDetails(empName1, empHoursWorked1, empHourlyRate1);
		
		//Display employee details #1
		System.out.println("\nEmployee 1 Details:");
		emp1.displayEmployeeDetails();	
		
		scan.nextLine(); //Consume leftover newline
		
		//Input for second employee
		System.out.println("\nEnter detail for Employee 2:");
		//กำหนดข้อความและตัวแปร
		System.out.print("Name: ");
		String empName2 = scan.nextLine(); 
		System.out.print("Hours Worked: ");
		int empHoursWorked2 = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double empHourlyRate2 = scan.nextDouble();
		
		//Set employee details
		emp2.setEmployeeDetails(empName2, empHoursWorked2, empHourlyRate2);
		
		//Display employee details #2
		System.out.println("\nEmployee 2 Details:");
		emp2.displayEmployeeDetails();	
		
		 
	}

}
