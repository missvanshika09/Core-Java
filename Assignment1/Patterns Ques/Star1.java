/*  *
  * * *
* * * * *
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner star=new Scanner(System.in);
		int n=star.nextInt();

		for(int i=0; i<n; i++) //forrow
		{
			for (int j=0; j<n-i-1; j++) { //for space in column
				System.out.print(" ");
			}
			for (int j=0; j<2*i+1; j++) { //for star in column
				System.out.print("*");
			}
			for (int j=0; j<n-i-1; j++) { //for space in column
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
