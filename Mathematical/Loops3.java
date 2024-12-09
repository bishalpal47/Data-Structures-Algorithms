package mathematical;
/*
* QUESTION - write a java program that prints the odd numbers between 9 and 48 using a while loop.
*
* SOLUTION - Since we just need to print the odd numbers between 9 and 48, we don't need to take any input from user.
* odd numbers are those numbers which are not divisible by 2. It means if there is an odd number say 'n',
* then, (n % 2) will always be equal to 1. Just use this condition in the while loop and print the numbers properly.
* */
public class Loops3 {
    public static void main(String[] args) {
        int number = 9; // Start from 9

        System.out.println("Odd numbers between 9 and 48: ");
        while (number <= 48) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
            number++;
        }
    }
}
/*
*                       OUTPUT
* ===================================================
Odd numbers between 9 and 48:
9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47
* */