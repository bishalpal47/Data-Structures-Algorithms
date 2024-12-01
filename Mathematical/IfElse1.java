package mathematical;

import java.util.Scanner;
/*
* QUESTION - Write a program that takes a input from the user and then check if the number is greater than 10,
* print "I am awesome!". If the number is not greater than 10, print "I am one of a kind!".
* Regardless of the value, print "Testing your knowledge"
*
* SOLUTION - Read the question properly. You have to print "Testing your knowledge" for sure regardless of the
* input value.
* check the input and print appropriate message.
* */

public class IfElse1 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = myObject.nextInt();
        myObject.close();

        // Checking if the number is greater than 10
        if (number > 10) {
            System.out.println("I am awesome!");
        } else {
            System.out.println("I am one of a kind!");
        }

        // Printing the common message
        System.out.println("Testing your knowledge");
    }
}

