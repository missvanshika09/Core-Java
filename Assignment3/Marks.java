import java.util.*;
public class Marks {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the marks");
			int marks=sc.nextInt();
			
			if(marks>=75) {
				System.out.println("Distinction");
			}
			else if(marks>=60 && marks<75) {
				System.out.println("first class");
			}
			else if(marks>=45 && marks<60) {
				System.out.println("Second class");
			}
			else if(marks>=35 && marks<45) {
				System.out.println("Second class");
			}

			else {
				System.out.println("Fail");
			}
			sc.close();
			
		}
		

	}

}
