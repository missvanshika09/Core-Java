//ResourceNotAllocatedException.java:
public class ResourceNotAllocatedException extends Exception 
{
public ResourceNotAllocatedException(String msg) 
{
super(msg); 
}
}
//MyResource.java:
import developer.ResourceNotAllocatedException;

public class MyResource implements AutoCloseable
{
public MyResource(int capacity) throws ResourceNotAllocatedException
{
if(capacity>100)
{
throw new ResourceNotAllocatedException("not sufficient space");
}
}
void disp()
{
System.out.println("successful");
}

public void close() 
{
System.out.println("resource is closed");
}
}
//Demo.java:
import developer.ResourceNotAllocatedException;

public class Demo5 
{
public static void main(String[]args)
{
try 
{
MyResource r = new MyResource(1000);
MyResource r = new MyResource(10);
r.disp();
}
catch(ResourceNotAllocatedException e)
{
e.printStackTrace();
}
}
}


/* on the developer side 
create checked exception "ResourceNotAllocatedException"

create a class:

public class MyResource implements AutoCloseable
{
	public MyResource(int capacity) throws ResourceNotAllocatedException
	{
		if(capacity>100)
		{
			throw new ResourceNotAllocatedException("not sufficient space");
		}
	}
    void disp()
    {
    	System.out.println("successful");
    }
	@Override
	public void close()  {
		System.out.println("resource is closed");
		
	}
}

create necessary jar file and documentation

on the client side
public class Demo with main function

	inside main function, create object of "MyResource" and invoke "disp()" method.


*/
