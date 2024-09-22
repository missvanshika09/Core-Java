import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre a number");
		int n=sc.nextInt();
		if(isPrime(n)) {
			System.out.println("is prime number");
		}
		else
		{
			System.out.println("is not a prime number");
		}
		sc.close();
	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2; i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
