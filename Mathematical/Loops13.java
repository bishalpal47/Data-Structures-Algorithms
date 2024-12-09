package mathematical;
/*
* QUESTION - Write a program that takes a number from the user - say 't'. Now, take 't' number of numbers
* from the user and print its factors which are greater than 23. If the user enters a number less than 81,
* prompt the user again to enter the correct number.
*
* SOLUTION - If you have done Question of factors ( Loops9.java, Loops10.java), you will have no problems here.
* Just one thing you have to keep in mind - the question has stated to print the factors which are GREATER than 23.
* So, start checking for factors from 24 (no need to start from 2)
*
* */
import java.util.Scanner;

public class Loops13 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        // Input the number of test cases
        System.out.print("Enter the number of numbers to process (t): ");
        int t = myObject.nextInt();

        for (int i = 1; i <= t; i++) {
            int number;

            // Ensure the number is at least 81
            do {
                System.out.print("Enter number " + i + " (must be >= 81): ");
                number = myObject.nextInt();

                if (number < 81) {
                    System.out.println("Oye! theek number de!");
                }
            } while (number < 81);
            myObject.close();

            // Find and print factors greater than 23
            System.out.println("Factors of " + number + " greater than 23 are:");
            for (int j = 24; j <= number; j++) { // Start from 24 since factors must be > 23
                if (number % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(); // For formatting
        }
    }
}
