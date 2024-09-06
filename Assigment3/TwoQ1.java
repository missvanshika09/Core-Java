/*1)	Define 2 classes “First” and “Second” with member variables , member functions and constructors of  your choice. Now define a class “Two” in which define main function .
In main function create various instances of First and Second  and call their individual member functions.*/
class First{
	int num;
	First(int num){
		this.num=num;
	}
	void getnum1() {
		System.out.println(this.num);
	}
}

class Second{
	double num;
	Second(double num){
		this.num=num;	
	}
	
	void getnum2() {
		System.out.println(this.num);
		
	}
}

public class TwoQ1 {

	public static void main(String[] args) {
	
		First f1=new First(400);
		Second s1=new Second(300);
		s1.getnum2();
		f1.getnum1();
		

	}

}

