package mathematical;
/*
* QUESTION - Write a program that takes a number as input and check -If the number is divisible by both 3 and 5,
* print "FizzBuzz". If it's divisible only by 3, print "Fizz". If it's divisible only by 5, print "Buzz".
* Otherwise, print "ekta bhalo number de.".
* */

import java.util.Scanner;

public class IfElse5 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = myObject.nextInt();
        myObject.close();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("ekta bhalo number de.");
        }
    }
}
