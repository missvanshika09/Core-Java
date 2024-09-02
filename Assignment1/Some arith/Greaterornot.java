import java.util.*;
public class Greaterornot
{	//	accept two numbers and check whether first number is greater or second number
//is greater or they are equal.


	public static void main(String[] args) {
		Scanner number=new Scanner(System.in);
		int first=number.nextInt();
		int second=number.nextInt();

		if(first>second)
			System.out.println("first number is greater");
		else if(first==second)
			System.out.println("they are equal");
		else
			System.out.println("second number is greater" );
	}
}
