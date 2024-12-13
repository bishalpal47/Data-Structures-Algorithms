package mathematical;
/*
* QUESTION - Write a program that takes a +ve number from the user and checks if it is an armstrong number or not.
* If the user enters a -ve number, ask for the input again after giving the message "neend mein hai kya?"
*
* SOLUTION - The question can be divided into two parts -
* part 1 - taking the input
* part 2 - Checking ARMSTRONG NUMBER - a number that is sum of its own digits raised to the power of total number
* of digits.
* example : 153
* it has the digits : 1, 5 and 3.
* total number of digits = 3
* So, if the sum of 1^3, 5^3, 3^3 is equal to 153, it is called as an armstrong number.
*
* You have to separate the digits and raise each digit to the power of (totalNumberOfDigits) and finally add them.
* if the sum is equal to the input number, then it's an Armstrong number.
* */

import java.util.Scanner;

public class Loops16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        while (true) {          // just another way to take input
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();

            if (number < 0) {
                System.out.println("Neend mein hai kya? Please enter a positive number.");
            } else {
                break;
            }
        }

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        sc.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);     // Math class has the static method - pow(base, exponent)
            number /= 10;
        }

        return sum == originalNumber;
    }
}
