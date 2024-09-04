package vanshika;
import java.util.*;
public class Long {


	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		do {
            System.out.println("Enter a number ");
            n = sc.nextInt();
            if (n != 0) {
                System.out.println(n);
            }
        } while (n != 0);

		sc.close();
	}
}
