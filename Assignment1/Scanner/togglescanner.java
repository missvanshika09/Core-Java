import java.util.Scanner;
public class togglescanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char[]  a=new char[6];
		System.out.println("Entre 6 characters:");
		for(int i=0;i<6;i++)					//accept
		{
		 a[i]=sc.next().charAt(0);
		}
		for(int i=0; i<6;i++)					//toggle
		{
			if(Character.isLetter(a[i])) {
				a[i]=toggleCase(a[i]);
			}
		}
		System.out.println("Toggle character")	;//display array
		for(char c: a) {
			System.out.println(c+" ");
		}
			sc.close();
		}

	private static char toggleCase(char c) {	//display toggle
		// TODO Auto-generated method stub
		if(Character.isUpperCase(c)) {
			return Character.toLowerCase(c);
		}else {
		
		return Character.toUpperCase(c);
	}
	}
	
}
