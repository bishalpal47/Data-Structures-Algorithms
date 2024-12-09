package mathematical;

/*
* QUESTION - Write a program that prints all the even numbers between 4 to 67 but skips any number which is multiple of 3.
* */

public class Loops5 {
    public static void main(String[] args) {
        System.out.println("Even numbers between 4 and 67, skipping multiples of 3:");

        for (int number = 4; number <= 67; number++) {
            if (number % 2 == 0) { // Check if the number is even
                if (number % 3 != 0) { // Print the number if and only if it is not a multiple of 3
                    System.out.print(number + " ");
                }
            }
        }   // end of loop
    }
}

/*
*                       OUTPUT
* ===================================================
Even numbers between 4 and 67, skipping multiples of 3:
4 8 10 14 16 20 22 26 28 32 34 38 40 44 46 50 52 56 58 62 64
* */