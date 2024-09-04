// sort array in Ascending order package hemant;
import java.util.*;
public class SortArray {

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

                                                     // Accepting 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
                                                     // Sorting the array in ascending order using Bubble Sort
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                                                           // Swap a[j] and a[j + 1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }                                                              // Displaying the sorted array
   System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
}

        sc.close();
    }
}


    
