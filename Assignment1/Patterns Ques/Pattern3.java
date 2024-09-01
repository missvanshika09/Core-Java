/*
        1 2 3 4 
          1 2 3 
            1 2 
              1 

  */
public class Pattern3
{
	public static void main(String args[]) {

		for(int i=1; i<=4; i++)

		{
			for(int j=1; j<=4; j++)
				if(i<=j)
					System.out.print(j-i+1);
				else
                    System.out.print(" ");

            System.out.print('\n');
		}
	}
}
