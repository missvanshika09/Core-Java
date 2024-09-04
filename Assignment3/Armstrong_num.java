// Armstrong Number 
import java.util.*;
public class Armstrong_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int sum=0;
		int no=n;
		while(n>0) {
			int digit=n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;			
		}
		if(sum==no) {
			System.out.println("the following number is armstrong");
		}
		else {
			System.out.println("Not an armstrong");
		}
		sc.close();
	}

}
