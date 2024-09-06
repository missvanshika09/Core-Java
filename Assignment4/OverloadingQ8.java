/*Define a parent class with one function. Define child class with the function having same name as of parent class function, but having different argument.
Create an instance of child class and call the functions. Make sure u have followed the concept of “function overloading “ in inheritance.*/
class A{
	void disp() {
		System.out.println("Content of class A");
	}
}

class B extends A{
	int k=90;
	void disp() {
		super.disp();
		System.out.println("the value of inherited class");
		
	}
	void disp(int k) {
		this.k=k;
		System.out.println("Value of num k "+k);

		
	}

}

public class OverloadingQ8 {

	public static void main(String[] args) {
	
		B b1=new B();
		b1.disp();
		b1.disp(95);

	}

}

