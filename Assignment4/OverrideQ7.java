/*Show the example of hierarchical inheritance with constructor invocation.*/

class Base{
	void disp() {
		System.out.println("Base disp");
	}
}
class Sub extends Base{
	void disp() {
		System.out.println("Sub disp");
		
	}
}


public class OverrideQ7 {

	public static void main(String[] args) {
		Sub s1=new Sub();
		s1.disp();
		

	}

}
