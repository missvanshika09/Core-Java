import java.util.*;
public class TablesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		int i=1;
		System.out.println("enter a number ");
		n=sc.nextInt();
		while(i<=10) {
			int prod=n*i;
			System.out.println(+n+" * "+i+" = "+prod);
			i++;
		}
sc.close();
	}

}
