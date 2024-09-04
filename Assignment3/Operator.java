import java.util.*;
public class Operator
{
	public static void main(String[] args) {
		/*	accept 2 numbers and a character as operator ( + , - ,* , / , % ). Perform arithmetic according to the character entered.
		t.*/

		Scanner oper=new Scanner(System.in);
		System.out.println("Enter an operator");
		char operator=oper.next().charAt(0);
		
		
		System.out.println("Enter number1 ");
		int number1=oper.nextInt();
		System.out.println("Enter number2 ");
		int number2=oper.nextInt();
		
		
		
		switch(operator) {
		case '+':
			System.out.println(number1 +number2);
			break;
		case '-':
			System.out.println(number1-number2);
			break;
		case '*':
			System.out.println(number1 -number2);
			break;
		case '/':
			System.out.println(number1 /number2);
			break;
		case '%':
			System.out.println(number1 %number2);
			break;
			default:
			System.out.println("Ooops, entered invaild operator");

		}
	}
}
