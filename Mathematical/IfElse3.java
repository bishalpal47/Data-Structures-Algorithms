package mathematical;

import java.util.Scanner;
/*
* QUESTION - Write a program that takes 3 numbers from the user. If the first number is greater than the 3rd number,
* print the additionof the 3 numbers. If the 1st number is equal to the 2nd number, make 1st number equal to 3rd
* number and print the message "Kya struggle hai!". Print the message "question dhyan se padho".
* */

public class IfElse3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking 3 numbers as input from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        scanner.close();

        // Checking the conditions
        if (num1 > num3) {
            int sum = num1 + num2 + num3;
            System.out.println("The sum of the three numbers is: " + sum);
        }

        if (num1 == num2) {
            num1 = num3;
            System.out.println("Kya struggle hai!");
        }

        // Common message
        System.out.println("question dhyan se padho");
    }
}

