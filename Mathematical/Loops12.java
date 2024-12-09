package mathematical;
/*
* QUESTION - Write a program that takes a number from the user - say 't'. Now, take 't' number of numbers from the
* user and for each number, check if it is even or odd.
*
* SOLUTION - So, you have to take a number from the user first. This number is going to be the number of test cases.
* you have to take 't' numbers from the user again and check if each number is even or odd.
*
* You can do it using a for loop.
* However, I have given another approach to do this. You will see that approach in the solutions of many questions.
*
* */

import java.util.Scanner;

public class Loops12 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        // Input the number of test cases
        System.out.print("Enter the number of numbers to check (t): ");
        int t = myObject.nextInt();

        /*
                    APPROACH 1
        for (int i = 1; i <= t; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = myObject.nextInt();

            // Check if the number is even or odd
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }
        myObject.close();*/

        //         APPROACH 2
        int copyOft = t;
        while(t-- > 0) {
            System.out.println("Enter number " + (copyOft - t) + " : ");    // you can even ignore this line.
            // the above line is just for YOUR information. Nobody cares about it. If you ignore the above line,
            // you don't even need to create the variable 'copyOft'.
            int number = myObject.nextInt();
            System.out.println(number % 2 == 0 ? (number + " is an even number."):(number + " is an odd number."));
        }
        myObject.close();
    }
}
