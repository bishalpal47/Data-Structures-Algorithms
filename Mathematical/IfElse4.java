package mathematical;

/*
* QUESTION - write a program that takes the age of the user and his nationality. If the age >= 18 and nationality
* is "Indian", print "you can vote". If the age is greater than or equal to 18 but nationality is not equal
* to "Indian", print "bhag yaha se, doosre desh mein ja". If the age is not greater than 18, print "abhi ghar
* jaa, bada ho ja, firr aana"
* */

import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        // Taking user input for age and nationality
        System.out.print("Enter your age: ");
        int age = myObject.nextInt();
        myObject.nextLine();  // Consume the newline character or else there will be problems for sure.

        System.out.print("Enter your nationality: ");
        String nationality = myObject.nextLine().trim();
        myObject.close();

        // Checking voting eligibility based on age and nationality
        if (age >= 18) {
            if (nationality.equalsIgnoreCase("Indian")) {
                System.out.println("you can vote");
            } else {
                System.out.println("bhag yaha se, doosre desh mein ja");
            }
        } else {
            System.out.println("abhi ghar jaa, bada ho ja, firr aana");
        }
    }
}
