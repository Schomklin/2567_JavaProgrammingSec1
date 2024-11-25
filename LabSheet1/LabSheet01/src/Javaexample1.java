import java.util.*;
public class Javaexample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first name(using next) : ");
		String firstName = input.next();
		input.nextLine();
		System.out.print("Enter your last name(using nextLine) : ");
		String lastName = input.nextLine();
		
		System.out.println("\n----Output----\n");
		System.out.println("First Name : "+firstName);
		System.out.println("Last  Name : "+lastName);
		
		input.close();
		
		
		
		
		
		
		
		
	}
}