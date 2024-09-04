import java.util.*;
public class Vowel
{
	public static void main(String[] args) {
		//accept a character and display (using if.. else ) whether it is vowel or not.

		Scanner Chara=new Scanner(System.in);
			System.out.println("Enter an character");
		char charh=Chara.next().charAt(0);
	

		if (charh=='a'||charh=='i'||charh=='o'||charh=='e'||charh=='u') {

			System.out.println("Entered character  is vowel");
		}

		else
		{
			System.out.println("Entered  character is not vowel");
		}
	}
}
