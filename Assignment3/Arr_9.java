//. create int array of 5 elements and accept 5 values inside it. Now accept one more number and check whether that number is there inside array or not.

import java.util.*;
public class Arr_9 {

	public static void main(String[] args) {

		int a[];
		Scanner sc = new Scanner(System.in);
		a=new int[5];
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();	
			
		}
		System.out.println("Enter a number to be searched for ");
		int n=sc.nextInt();
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				System.out.println(" Number "+n+" found at index "+i);
				found = true;
				break;
			}
			if (!found) {
	            System.out.println("Number " + n + " not found in the array.");
	        }
		}
		sc.close();
}

}

