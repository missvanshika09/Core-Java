/*2) On the developer side create an exception:
	NumberNotDivisibleBySevenException
	as a checked exception

create necessary jar and documentation.

on client side
	public class MyMath class with 
		public void disp(int num)
this disp() method will check if the number passed is not divisible by 7 , it will raise "NumberNotDivisibleBySevenException" or else it will simply display the number passed.
	[ this method shouldn't handle the exception]

	public class Demo
		main function 
		invoke "disp()" of "MyMath" class.

*/

import client.MyMath;
import developer.NumberNotDivisibleBySevenException;

public class Demo 
{
public static void main(String[] args)
{
try
{
MyMath.disp(-7);
}
catch(NumberNotDivisibleBySevenException e) 
{
e.printStackTrace();
}
}
}

//MyMath.java:
import developer.NumberNotDivisibleBySevenException;

public class MyMath 
{
public static void disp(int num) throws NumberNotDivisibleBySevenException
{
if(num%7!=0)
{
throw new NumberNotDivisibleBySevenException("Number is not divisible by 7");
}
else
{
System.out.println(num+ " is divisble by 7");
}
}
}

//Demo.java:
import client.MyMath;
import developer.NumberNotDivisibleBySevenException;

public class Demo 
{
public static void main(String[] args)
{
try
{
MyMath.disp(49);
MyMath.disp(41);

}
catch(NumberNotDivisibleBySevenException e) 
{
e.printStackTrace();
}
}
}

