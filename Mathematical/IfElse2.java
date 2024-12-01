package mathematical;

import java.util.Scanner;
/*
* QUESTION - Write a program that takes a number from the user and check - if the number is greater than 30, print "I am creating list"
if the number is less than 30 but greater than 20, print "just joking". if the number is less than 20 but greater than 7, print
"hello world". If the number is less than 7 print "arghhh, this is annoying".
* */
public class IfElse2 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = myObject.nextInt();
        myObject.close();

        // Checking the number against the conditions
        if (number > 30) {
            System.out.println("I am creating list");
        } else if (number > 20) {
            System.out.println("just joking");
        } else if (number > 7) {
            System.out.println("hello world");
        } else {
            System.out.println("arghhh, this is annoying");
        }
    }
}
