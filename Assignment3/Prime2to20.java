//display prime numbers from 2 to 20
public class Prime2to20 {

	public static void main(String[] args) {
		                                              // TODO Auto-generated method stub
		for(int i=2;i<=20;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
			}
		}
		
	public static boolean isPrime(int n) {
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
