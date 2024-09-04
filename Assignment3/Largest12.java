/Accept 3 numbers from the user and find the highest one
import java.util.*;
public class Largest12 {

	public static void main(String[] args) {
	                                                        
    Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println(+a+ " is the  highest number");
		}
		else if(b>c)
		{
			System.out.println(+b+" is the highest number");
		}
		else
		{
			System.out.println(+c+" is the highest number");
		}
 		sc.close();
}
}
