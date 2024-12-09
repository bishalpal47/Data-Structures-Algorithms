package mathematical;

/*
* QUESTION - Write a program that prints the factorial of number 7 using do while loop and while loop.
*
* SOLUTION - Factorial of a number - say 'n' is calculated like this
* factorial = n * (n-1) * (n-2) * .... * 3 * 2 * 1
*
* */

public class Loops7 {
    public static void main(String[] args) {
        int number = 7;

        // Factorial using do-while loop
        long factorialDoWhile = 1;
        int i = 1;
        do {
            factorialDoWhile *= i;
            i++;
        } while (i <= number);
        System.out.println("Factorial of 7 using do-while loop: " + factorialDoWhile);


        // Factorial using while loop
        long factorialWhile = 1;
        int j = 1;
        while (j <= number) {
            factorialWhile *= j;
            j++;
        }
        System.out.println("Factorial of 7 using while loop: " + factorialWhile);
    }
}
