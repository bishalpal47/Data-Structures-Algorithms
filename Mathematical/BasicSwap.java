package mathematical;

import java.util.Scanner;

/*
* QUESTION - Write a program to take 2 numbers as input and swap the values of those 2 variables.
* */

public class BasicSwap {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = obj.nextInt();
        System.out.print("Enter the second number : ");
        int b = obj.nextInt();

        System.out.println("\nBefore swapping\nFirst number = " + a + "\nSecond number = " +b);

        // logic for swapping 2 numbers
        int temp = a;
        a = b;
        b =  temp;

        System.out.println("\nAfter swapping\nFirst number = " + a + "\nSecond number = " +b);
    }
}
