import java.util.*;
public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter a number ");
		n=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int prod=n*i;
			System.out.println(+n+" * "+i+" = "+prod);
		}
sc.close();
	}

}
