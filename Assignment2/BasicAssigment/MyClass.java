class MyClass {

	private int no1;
	private int no2;

	MyClass()
	{
		System.out.println("inside default constructor");
	}

	MyClass(int no1)
	{
		this.no1=no1;
		System.out.println("inside parameterized constructor");
	}
	MyClass(int no1,int no2)
	{
		this.no1=no1;
		this.no2=no2;
		System.out.println("inside parameterized constructor with 2 parameters");
	}


}
public class MyClass {
	public static void main(String[] args) {
		// Instantiating with no arguments
		MyClass obj1 = new MyClass();

		// Instantiating with one argument
		MyClass obj2 = new MyClass(50);

		// Instantiating with two arguments
		MyClass obj3 = new MyClass(80, 0);
	}
}
