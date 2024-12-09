package mathematical;
/*
 * QUESTION - Write a program that takes a number from the user - say 't'. Now, take 't' number of numbers from
 * the user and for each number, print its digits separately in 1 line. If those numbers are -ve, take the
 * input again after printing this message - "sahi se number de."
 *
 *
 * SOLUTION - This question has 2 parts -
 * part 1 - getting the correct input 't' number of times.
 * part 2 - separating the digits of the input number.
 *
 * you should already know how to do the part 1 by now. If not, go do the previous questions.
 * There are 2 approaches to solve part 2.
 *
 * APPROACH 1 - You convert the number to a string. Then convert the string to a character array using the
 * in-built methods of String class. Then just traverse this character array and print the elements. DONE!
 *
 *
 * APPROACH 2 - First you have to reverse the number. Then you have to print the digits of the reversed number.
 * But to reverse the number
 *      FIRST - you have to get its digits.
 *      SECOND - You have to create a new number by properly using the extracted digits.
 * How to do the above?
 * example => inputNumber = 1234
 * you have to extract the last digit of inputNumber and create a new variable - reversedNumber initialized to 0.
 * reversedNumber = reversedNumber * 10 + getLastDigit.
 * and inputNumber = inputNumber / 10;
 * you have to keep doing it until your inputNumber becomes equal to 0.
 *
 * Once you have the reversedNumber. You can print its individual digits.
 *
 * */

import java.util.Scanner;

public class Loops15 {
    public static void approach2(int inputNumber) {
        int reversed = 0;
        if(inputNumber == 0) {           // EDGE CASE
            System.out.println(0);
            return;         // notice that I am NOT RETURNING ANYTHING. I am just saying to return.
        }

        // Reverse the number to print digits in correct order
        while (inputNumber > 0) {
            reversed = reversed * 10 + inputNumber % 10;
            inputNumber /= 10;
        }

        // Print the digits of the reversed number
        while (reversed > 0) {
            System.out.print(reversed % 10 + " ");
            reversed /= 10;
        }
        System.out.println();
    }

    public static void approach1(int number) {
        String numberStr = String.valueOf(number);
        for (char digit : numberStr.toCharArray()) {
            System.out.print(digit + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        // PART 1
        System.out.println("Enter the number of inputs (t):");
        int t = myObject.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("Enter a positive number:");
            int number = myObject.nextInt();

            // Check for negative numbers
            while (number < 0) {
                System.out.println("sahi se number de.");
                number = myObject.nextInt();
            }

            System.out.print("Digits of the number " + number + " are as follows : ");
            //      PART 2
            approach1(number);
            // approach2(number);           // you can uncomment this line
        }
        myObject.close();
    }
}
