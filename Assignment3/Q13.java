//accept 6 character in an array and toggle them
import java.util.Scanner;
public class Q13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 6 character");
        char arr[]=new char[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next().charAt(0);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(Character.isUpperCase(arr[i])){
                arr[i]=Character.toLowerCase(arr[i]);
            }else{
                arr[i]=Character.toUpperCase(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    
}
