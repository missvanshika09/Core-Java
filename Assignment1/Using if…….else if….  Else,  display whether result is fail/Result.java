import java.util.*;
public class Result
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int x= sc.nextInt();
		if(x<=30)
		{
			System.out.println("fail");
		}
		else if(x<=60 && x>=40)
		{	System.out.println("second class");
		}
		else if(x<=100)
		{
			System.out.println("First class");
		}
		else
			System.out.println("incorrect entry");


	}
}
