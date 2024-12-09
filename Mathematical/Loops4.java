package mathematical;

/*
* QUESTION - write a program that prints the even numbers divisible by 4 between 7 and 78 using do-while loop.
* */

public class Loops4 {
    public static void main(String[] args) {
        int number = 7;

        System.out.println("Even numbers divisible by 4 between 7 and 78:");
        do {
            if (number % 4 == 0) {
                System.out.print(number + " ");
            }
            number++;
        } while (number <= 78);
    }
}
/*
*                       OUTPUT
* ===================================================
Even numbers divisible by 4 between 7 and 78:
8 12 16 20 24 28 32 36 40 44 48 52 56 60 64 68 72 76
* */
