import java.util.*;
public class Largest{

	public static void main(String[] args) {
		                                           // TODO Auto-generated method stub
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
