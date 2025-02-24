import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	
	public void insert() throws IOException {
		Scanner console = new Scanner(System.in);
		//บันทึกข้อมูลลงไฟล์
		PrintStream writeFile = new PrintStream(new File("src//txtFile//employee.txt"));
		
		String answer;
		do {
			super.header();
			System.out.print("Enter name:");
			name = console.next();
			System.out.print("Enter department:");
			dept = console.next();
			//บันทึกข้อมูล name,dept ลงไฟล์
			writeFile.println(name + "\t" + dept);
			
			System.out.print("Enter data again?: ");
			answer = console.next();			
		}while(answer.equalsIgnoreCase("y"));		
	} //end of insert() 

}//end of class
