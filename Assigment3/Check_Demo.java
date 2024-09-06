/*Define a class “Check” in which declare member variables using  different accessibility modifiers i.e.  <default>, private ,public and protected.   Define a function “disp”  which should be public.  Define a class “CheckDemo” in which you will write “main()” function. Create an instance of  the class “Check” and  show how many  variables can be accessed directly and how many indirectly.
*/
class check{
	private int num=100;
	public int num1=200;
	protected int num2=300;
int num4=400;
	
	public void disp(){
		System.out.println("Private variable "+num);
		
	}
}

public class Check_Demo {

	public static void main(String[] args) {
	
		check check=new check();
		check.disp();

		System.out.println("Public variable "+check.num1);
		System.out.println("protected variable "+check.num2);
		System.out.println("Default Variable "+check.num4);

	}

}

