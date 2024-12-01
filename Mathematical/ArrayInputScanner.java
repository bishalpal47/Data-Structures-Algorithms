package mathematical;

import java.util.Scanner;
/*
* QUESTION - Write a program to take 5 numbers from the user and store it in an array using Scanner.
* */
public class ArrayInputScanner {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        int[] numbers = new int[5];  // Array to store 5 numbers

        // Taking input from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = myObject.nextInt();
        }
        myObject.close();

        // Displaying the numbers
        System.out.print("\nThe numbers stored in the array are : ");
        for (int number : numbers) {            // I am using for-each loop.
            System.out.print(number + " ");
        }
    }
}
/*
*                   OUTPUT
* =============================================
* Enter 5 numbers:
* Number 1: 99
* Number 2: 66
* Number 3: 33
* Number 4: 22
* Number 5: 11
*
* The numbers stored in the array are :99 66 33 22 11
*
* */