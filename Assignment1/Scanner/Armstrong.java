import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Entre Three-digit numbers:");
        int number=sc.nextInt();
      int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int units = number % 10;

            // Calculate the sum of cubes of its digits
            int sumOfCubes = (hundreds * hundreds * hundreds) + 
                             (tens * tens * tens) + 
                             (units * units * units);

            // Check if the sum of cubes equals the original number
            if (sumOfCubes == number) {
                System.out.println(number+ "Armstrong number");
            }
      else
              System.out.println(number+ "is not an Armstrong number");
        }
    }

