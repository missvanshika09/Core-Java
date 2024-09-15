/*on the developer side create following checked exception:
	InvalidLengthException
create necessary jar file and documentation.

on client side

public class Authenticator
	with
a parameterized constructor which takes String as a password.
this class also will have "done()" method with "successful authentication" message.
Parameterized constructor should check the length of the password passed if it is less than 5 or more that 9 , it should raise "InvalidLengthException" 
	[ constructor shouldn't handle the exception]

create a class "Demo" with main
	inside main function create the object of "Authenticator" class and invoke "done()" method.
*/
//InvalidLengthException.java:

public class InvalidLengthException extends Exception
{
public InvalidLengthException (String msg)
{
super(msg);
}
}
//Authenticator.java:
import developer.InvalidLengthException;

public class Authenticator 
{
public Authenticator(String password) throws InvalidLengthException
{
if(password.length()<5)
{
throw new InvalidLengthException("Password too short");
}
else if(password.length()>9)
{
throw new InvalidLengthException("Password too long");
}
}
public void done() 
{
System.out.println("successful authentication");
}
}
//Demo.java:

import developer.InvalidLengthException;

public class Demo4 
{
public static void main(String[]args)
{
try 
{
Authenticator a = new Authenticator("Password1234");
Authenticator a = new Authenticator("Password");
a.done();
}
catch (InvalidLengthException e) 
{
e.printStackTrace();
}
}
}

