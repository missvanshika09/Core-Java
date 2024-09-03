import java.util.*;
public class Divisible
{
	public static void main(String[] args) {
	    // accept a number and display whether it is divisible by 7 or not.
	    Scanner div=new Scanner(System.in);
	    int no1=div.nextInt();
	    if(no1%7 ==0)
	    {
	    	System.out.println("it is divisible by 7");
	    }
	   else
		System.out.println("it is not divisible by 7");
	}
}
