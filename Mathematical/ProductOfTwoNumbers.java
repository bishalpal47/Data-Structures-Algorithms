package mathematical;

import java.util.Scanner;

/*
* QUESTION - Write a Java program that takes two numbers as input and displays the product of two numbers.
*
* SOLUTION - Since you have to take input from user, you can use either Scanner or BufferedReader.
* Choose any 1 and create its object. Import these classes properly.
* Take the input from the user AFTER you give some message using print().
* Close the object after using it.
*
* Multiply the two values and store it in a new variable and finally print it.
* */
public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.println();       // for printing a new line.

        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        sc.close();                 // since I don't need to take anymore inputs, I will close the Scanner object.
        System.out.println();

        int result = a * b;
        System.out.println("The multiplication of two numbers " + a + " and " + b + " is equal to " + result);
    }
}
