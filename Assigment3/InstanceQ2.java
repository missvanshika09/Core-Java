/*	Create a class with static and non-static member variables. Define static and non-static member functions. Create instance of this class and call both static and non-static member functions
*/

// Q2 Assignment 4
class One{
	int num;
	static int num2=300;
	
	void getnum(int num) {
		System.out.println("Value of non static variable "+num);
	}
	static void staticmethod() {
		System.out.println("Value of static variable "+num2);
	}
}

public class InstanceQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One o1=new One();
		o1.getnum(400);
		One.staticmethod();

	}

}



