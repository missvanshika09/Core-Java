//accept a number and display whether it is prime or not
import java.util.*;
public class Prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag =1;
		if(n<=1) {
			System.out.println("The number is not prime");
		}
		if(n==2) {
			System.out.println("The number is a prime number");
		}
		for(int i=2;i<n-1;i++) {
			if(n%i==0) {
				flag=0;
				break;
			}	
		}
		if(flag==1) {
			System.out.println("the following number is a prime number");
		}
		else {
			System.out.println("the following number is not  a prime number");
		}
sc.close();
}
	}

