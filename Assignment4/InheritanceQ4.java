/*4)Show the example of single level inheritance with constructor invocation*/

class Parent{
	Parent(int a){
		System.out.println("Parent constructor with parameter "+a);
	}
	
}
class Child extends Parent{
	Child(int a){
		super(a);
		System.out.println("Child constructor with parameters "+a);
	}
}
public class InheritanceQ4 {

	public static void main(String[] args) {
		
		Child obj=new Child(10);

	}

}
