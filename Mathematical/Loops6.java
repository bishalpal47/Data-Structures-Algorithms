package mathematical;
import java.util.Scanner;
/*
* QUESTION - Write a program that takes a number - say "n" from the user and prints the sum of first "n"
* natural numbers. If the user enters 0 or any -ve number as input, ask for the input again. Do this until
* the user enters a positive integer.
*
* SOLUTION - Let' do it step by step.
* First - you have to take input from the user. So, create an object of the Scanner class (you can use BufferedReader too).
* Take the input. Now, in the question, it is said that if the user enters 0 or any -ve number as input, ask for the input again.
* Do this until the user enters a positive integer.
* Since I don't know WHEN the user will give me a +ve number and I have to keep doing it again & again,
* I have to use a while loop. I set the condition that if (n<0), keep running the loop and keep taking input.
* when I get a +ve value for 'n', I will just stop the loop.
*
* Second - you can find the sum of n natural numbers by 2 methods.
* APPROACH 1 - Use a for loop. Start from 1 till 'n'. Create a variable that keeps track of the sum of the values from
* i = 1 to n.
*
* APPROACH 2 - Use the formula to calculate sum of first n natural numbers :    (n * (n+1)) / 2;
* */

public class Loops6 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        System.out.print("Enter a positive integer for the variable 'n' : ");
        int n = myObject.nextInt();

        while(n < 0) {
            System.out.print("As I said, enter a POSITIVE integer. Maths nahi padha kya? : ");
            n = myObject.nextInt();
        }
        myObject.close();       // I am closing the object now because I don't need to take any inputs after the loop.
                                // remember this, you can close the object of Scanner at the end of the program too.

        // APPROACH 1
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        /*
        * APPROACH 2
        * After the while loop, just use the next line -
        * System.out.println("The sum of the first " + n + " natural numbers is: " + ( (n * (n+1)) / 2 ));
        * */
    }
}
