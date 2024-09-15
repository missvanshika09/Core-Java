/*define "MyException" as a checked exception.

define a class "Demo" with 
	public void show1(), public void show2() , public void show3() and main functions.

inside "show3()" accept a number and if it is greater than 10 raise "MyException" else display the number.
	[ this method shouldn't handle the exception]

main() function should call "show1()" , 
show1() function should call "show2()",
show2() function should call "show3()"

show2() should not handle the exception but show1() should handle.
*/
public class MyException extends Exception
{
public MyException(String msg)
{
super(msg);
}
}
//Demo.java

import java.util.Scanner;

public class Demo3 
{
public static void show1()
{
try
{
show2();
}
catch(MyException e)
{
e.printStackTrace();
}
}
public static void show2() throws MyException
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number : ");
int num = sc.nextInt();
show3(num);
}
public static void show3(int num) throws MyException
{
if(num>10)
{
throw new MyException("Number is greater than 10");
}
else
{
System.out.println("The Number entered is: " +num);
}
}
public static void main(String[] args)
{
show1();
}
}


