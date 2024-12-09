import java.util.*;
public class Lab301 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in); 
		//กำหนดตัวแปร text สำหรับรวมข้อความที่ป้อนทาง console 
		String text="";
		//กำหนดตัวแปร word สำหรับรับข้อมูลทาง console
		String word;
		while(true) {
			System.out.print("Enter word: ");
			word = kb.next();
			//terminate loop while
			if(word.equalsIgnoreCase("stop")) {
				System.out.println("Your terminate program...");
				break;				
			}		
			text = text + word+" "; //text+=word+" "
		}//end of while
		
		System.out.println(text.toUpperCase());		
		
		kb.close();
	}

}
