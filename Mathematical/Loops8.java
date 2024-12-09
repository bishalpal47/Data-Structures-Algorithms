package mathematical;
import java.util.Scanner;

/*
 * QUESTION - Write a program that takes a number from the user and prints the factorial of that number using
 * do-while loop. If the user enters a -ve number then print the message - "bhai, kya kar raha hai?".
 * Keep doing it until the user enters a +ve number.
 *
 * SOLUTION - Well, this problem is similar to the previous one in the part of taking input HOWEVER you have to use
 * the do-while loop.
 * Now, there are 2 parts of this question -
 * PART 1 : taking the input for variable 'n'
 * PART 2 : calculating the factorial of n using do-while loop.
 *
 * Let's do the PART 1 first.
 * There are 2 approaches to do this
 * APPROACH 1 - You can do it like the previous question. Using a while loop.
 * APPROACH 2 - Since you know that you have to take the input AT LEAST ONCE, why not use the do-while loop?
 * Put the condition as (n<0) - this will ensure that the loop will keep running until the value of n.
 *
 *
 * Now, the PART 2.
 * you can do it in 2 ways
 * APPROACH 1 - Do what you did in the previous question i.e. the logic of calculating factorial using a
 *              while / do-while / for loop.
 * APPROACH 2 - You can put the APPROACH 1 inside the APPROACH 2 of PART 1. i.e. nested do-while loops.
 *
 *
 * I will give you 2 combinations :
 * combination 1 : ( APPROACH 1 of PART 1     +      APPROACH 1 of PART 2 )
 * combination 2 : ( APPROACH 2 of PART 1     +      APPROACH 2 of PART 2 )
 *
 * you can try out other such combinations.
 * */

public class Loops8 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("\t\tThis is COMBINATION 1");
        System.out.println("========================================");

        System.out.print("Enter a positive integer for the variable 'n' : ");
        int n = myObject.nextInt();

        while(n < 0) {
            System.out.print("As I said, enter a POSITIVE integer. Maths nahi padha kya? : ");
            n = myObject.nextInt();
        }

        int factorialResult = 1;
        for(int i = n; i >= 1; i--) {
            factorialResult *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorialResult);



        // COMBINATION 2
        int number;
        System.out.println("========================================");
        System.out.println("\t\tThis is COMBINATION 2");
        System.out.println("========================================");
        do {
            System.out.print("Enter a positive number to calculate its factorial: ");
            number = myObject.nextInt();

            if (number < 0) {
                System.out.println("Andha naki rey? Chasma laga 😑");       // Emni change korlam😜
            } else {
                long factorial = 1;
                int i = 1;
                do {
                    factorial *= i;
                    i++;
                } while (i <= number);

                System.out.println("Factorial of " + number + " is: " + factorial);
            }
        } while (number < 0);

        myObject.close();
    }
}

