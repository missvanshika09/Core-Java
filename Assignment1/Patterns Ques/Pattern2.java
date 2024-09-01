/*
1 2 3 4 
1 2 3 
1 2 
1*/
public class Pattern2
{
	public static void main(String args[]) {

		for(int i=4; i>=1; i--)

		{
			for(int j=1; i>=j; j++)
				System.out.print(j);

			System.out.println(" ");
		}

	}
}
