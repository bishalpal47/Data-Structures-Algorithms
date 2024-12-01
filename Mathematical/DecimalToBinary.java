package mathematical;

import java.util.Scanner;
/*
* QUESTION - Write a program that takes a number from user and prints it in its binary form.
*
* */

public class DecimalToBinary {

    static void convertToBoolean(int number) {
        int anotherCopy = number;
        int [] arrayToStoreTheDigits = new int[30];     // I am just taking a random size of 30.
        int i = 0;

        // store the remainder in the array while dividing the number by 2.
        while(number > 0) {
            arrayToStoreTheDigits[i] = number % 2;
            number = number / 2;
            i++;
        }

        System.out.print("The number " + anotherCopy + " in binary form is : "  );
        // traverse the array from the back. Notice that we are starting from (i-1) because in the above while loop
        // the iterating variable "i" stopped 1 position AFTER the last inserted element in the array.
        for(int j= i-1; j >= 0; j--) {
            System.out.print(arrayToStoreTheDigits[j]);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int decimalNumber = obj.nextInt();
        obj.close();

        convertToBoolean(decimalNumber);
    }
}

/*
*                   OUTPUT
* ============================================
* Enter a number : 51
* The number 51 in binary form is : 110011
*
* */