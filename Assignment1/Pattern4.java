/*
1
1 2 
1 2 3 
1 2 3 4 
1 2 3 
1 2                           mirror image of the above code 
1
*/

public class Pattern4
{
	public static void main(String args[]) {

		for(int i=1; i<=4; i++)

		{
			for(int j=1; i>=j ; j++)

				System.out.print(j);

			System.out.print('\n');
		}
		for(int i=3; i>=1; i--)

		{
			for(int j=1; i>=j ; j++)

				System.out.print(j);

			System.out.print('\n');
		}
	}
}
