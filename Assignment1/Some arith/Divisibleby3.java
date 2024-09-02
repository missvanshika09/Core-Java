import java.util.*;
public class Divisibleby3
{	//accept a number and check whether it is divisible by 3 or not.

	public static void main(String[] args) {
		Scanner divi=new Scanner(System.in);
		int x=divi.nextInt();
		if(x/3==0)
			System.out.println(x);
		else
			System.out.println("Not Divisible");
	}
}
