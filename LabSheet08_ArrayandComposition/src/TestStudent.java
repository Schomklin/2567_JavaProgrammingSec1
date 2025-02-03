import java.util.*;
public class TestStudent {
	public static void main(String[] args) {
		// กำหนด object ในการรับข้อมูลทาง console(keyboard)
		Scanner scan = new Scanner(System.in);
		// แสดงผลและรับจำนวนนักศึกษาใน class เรียน
		System.out.print("How many students in classroom: ");
		int numberofStudent = scan.nextInt();
		scan.nextLine();
		
		//Array Object Step1:Create an array of Student objects
		Student[] students = new Student[numberofStudent];
		
		//วนรอบรับข้อมูลของแต่ละ array object
		for(int i=0;i<numberofStudent;i++) {
			//Array Object Step2:Crate a new Student Object
			students[i] = new Student();
			System.out.println("\nINPUT INFORMATION OF STUDENT "+(i+1));
			Line();
			//แสดงข้อความและรับข้อมูลชื่อ
			System.out.print("Input student name: ");
			//String stdName = scan.nextLine();
			//students[i].setName(stdName);
			students[i].setName(scan.nextLine());
			//แสดงข้อความและรับข้อมูลคะแนน
			System.out.print("Input student score: ");
			int stdScore = scan.nextInt();
			scan.nextLine();
			students[i].setScore(stdScore);	
			while(!students[i].checkScore()) {
				System.out.print("Input student score, again: ");
				stdScore = scan.nextInt();
				students[i].setScore(stdScore);	
			}//end while()
		}//end for() input data
		
		System.out.println("\nLIST OF PASS STUDENTS(>=50)");
		Line();
		//วนรอบเพื่อแสดงข้อความที่ต้องการตามโจทย์(output)
		//using foreach
		for(Student student : students) {
			if(student.isPass()) {
				System.out.println(">> " + student.getName() + 
						" (" + student.getScore()+")" + 
						" get grade "+ findGrade(student.getScore()));				
			}			
		}//end of foreach				
		
		scan.close();
	}//end main() method
	
	public static String findGrade(int score) {
		if(score >=80) return "A";
		else if(score >=75 && score<=79) return "B+";
		else if(score >=70) return "B";
		else if(score >=65) return "C+";
		else if(score >=60) return "C";
		else if(score >=55) return "D+";
		else if(score >=50) return "D";
		else return "F";		
	}
	
	public static void Line() {
		for(int i=1;i<40;i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}//end class
