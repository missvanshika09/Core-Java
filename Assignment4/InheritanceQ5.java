/*Show the example of multi-level inheritance with constructor invocation*/

class Base{
	int num=200;
	Base(int num){
		this.num=num;
		
	}
	void display_1(){
		System.out.println("Value in base constructor is "+num);
	}
	
}
class Sub_1 extends Base{
	int num1=300;
	Sub_1(int num1){
		super(num1);
		this.num1=num1;
	}
	void display_2() {
		System.out.println("Vlaue of child constructor is "+num1);
	}
}
class Sub_2 extends Sub_1{
	int num2=400;
	Sub_2(int num2){
		super(num2);
		this.num2=num2;
	}
	void display_3() {
		System.out.println("Value of second child class is "+num2);
	}
	
}

public class InheritanceQ5 {

	public static void main(String[] args) {
		
		Sub_1 s1=new Sub_1(500);
		s1.display_1();
		s1.display_2();
		
		Sub_2 s2=new Sub_2(600);
		s2.display_3();
		s2.display_2();
Base b1=new Base(600);
		b1.display_1();
	}

}


		


