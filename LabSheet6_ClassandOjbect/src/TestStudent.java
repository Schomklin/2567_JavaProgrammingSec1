
public class TestStudent {
	public static void main(String[] args) {
		//Create two Student objects
		Student std1 = new Student();
		Student std2 = new Student();
		
		//Set student details
		std1.setStudentDetails("Intouch", new double[] {85.0,67.0,78.5});
		std2.setStudentDetails("Sukonlawat", new double[] {90.0,59.8});
		
		//Display student details
		line('=');	
		System.out.println("Student#1 Details:");
		std1.displayStudentDetails();
		line('*');		
		System.out.println("\nStudent#2 Details:");
		std2.displayStudentDetails();
		line('-');	
	}//end of main() Method
	
	public static void line(char ch) {
		//System.out.println("*******************");
		for(int i=1;i<40;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}//end of line() Method
	

}
