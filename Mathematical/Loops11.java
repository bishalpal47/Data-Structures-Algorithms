package mathematical;
/*
* QUESTION - Write a program that takes a number from user and checks if it is a perfect number or not.
*
* SOLUTION - A perfect number is a positive integer (means > 0) that is equal to the sum of its proper divisors (excluding itself).
* For example: 6 is a perfect number because
* 1+2+3=6.
* 28 is a perfect number because
* 1+2+4+7+14=28.
*
* NOTE - Only iterate up to number/2 because no divisor except the number itself can be greater than (number/2)
* */
import java.util.Scanner;

public class Loops11 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int number = myObject.nextInt();

        // Find the sum of proper divisors
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number
        if (sum == number && number > 0) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
