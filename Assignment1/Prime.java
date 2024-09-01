
public class Prime
{
	public static void main(String args[]) {

		for(int i=3; i<=30; i++)

		{
			int flag=1;     //	boolean isPrime=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag=0;      //isPrime=false;
					break;
				}

			}
			if(flag==1)          //if(isPrime)
			{
				System.out.println(i);
			}
		}
	}
}
