package mathematical;

/*
 * QUESTION - Write a program that takes a number from the user. If the number is smaller than 43, tell the user
 * to enter a number again. Keep doing it until he enters a number greater than or equal to 43. After getting
 * the appropriate number, find the total number of factors of the input number except itself and print if it
 * is an even number or odd number.
 *
 * SOLUTION - This question has 2 parts
 * part 1 - getting the input from the user which is greater than 43.
 * part 2 - counting the factors of the input number and printing if the total number of factors is even or odd.
 * */

import java.util.Scanner;

public class Loops10 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        int number;

        // PART 1 - Keep asking the user for input until a valid number is entered
        do {
            System.out.print("Enter a number (must be greater than or equal to 43): ");
            number = myObject.nextInt();
            if (number < 43) {
                System.out.println("The number is too small. Please try again.");
            }
        } while (number < 43);
        myObject.close();

        // PART 2 - Find and print all factors of the number
        int numberOfFactors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                numberOfFactors++;
            }
        }

        System.out.println((numberOfFactors % 2 == 0) ? "Even number of factors" : "Odd number of Factors");
    }
}
