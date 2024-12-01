package mathematical;
/*
* QUESTION - Write a Java program to print the addition, multiplication, subtraction, division and remainder of two numbers
*
* */

import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = myObject.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = myObject.nextDouble();
        myObject.close();

        // Performing arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;

        // Displaying the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);


    }
}
