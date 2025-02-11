package mathematical;

import java.util.Scanner;

/*
* QUESTION - "Write a program to take a positive number from the user and find the digit root of the number.
* The digit root of a number is obtained by repeatedly summing its digits until a single-digit number is obtained.
Input: N = 9875
Output: 2
Explanation: 9+8+7+5 = 29, 2+9 = 11, 1+1 = 2"
*
* ANSWER - Keep prompting the user for an integer until he enters a positive number.
*  After you get the number, do this
*
*       Step 1 - you have to get each digit of the number.
*       Step 2 - keep adding the digits to get the sum.
*       Step 3 - Once you get the sum, assign it to the original number.
*                   if the sum is greater than or equal to 10, Repeat from step 1
*
* */
public class DigitRoot {
    public static int digitRoot(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number greater than 0 : ");
        int n = sc.nextInt();
        while(n < 0) {
            System.out.println("You entered a -ve number. Enter a positive number : ");
            n = sc.nextInt();
        }
        System.out.println("You entered : " + n);
        System.out.println("Digit Root: " + digitRoot(n));
    }
}
