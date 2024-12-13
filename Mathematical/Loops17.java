package mathematical;
/*
* QUESTION - Write a program to take a number from the user and check if it is a palindrome or not.
*
* SOLUTION - Palindrome is a number Or string that reads the same OR has the same value when read backwards.
* example: 1551
* read it from the start or from the back, it remains 1551. So, it's a palindrome.
*
* example: "madam"   - a palindrome.
*
* The solution is pretty simple. Extract the digits. Create a new number which is reverse of the original number.
* check if the reversed number is the same as the input number - that's it.
* */

import java.util.Scanner;

public class Loops17 {
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();
        sc.close();

        if (isPalindrome(Math.abs(number))) {   // I am passing the absolute value of the input number to the method.
            // Even if the user enters a negative number, I will just make it positive and check if it is a palindrome or not.
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

    }
}
