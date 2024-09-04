import java.util.*;
public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println("the following number is even");
		}
		else if(n==0) {
			System.out.println("The following number is 0");
		}
		else {
			System.out.println("The following number is odd");
			
		}
		sc.close();

	}

}
