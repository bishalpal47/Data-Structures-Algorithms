package mathematical;

import java.util.Scanner;

/*
* QUESTION - Write a program to take 2 integer values - for age ( years and months ) of a person and calculate
* how many days he has lived. Use 365 days for each year and 30 days for each month. Print the age in number of days.
*
* SOLUTION - Take the inputs for years and months from user. Multiply the number of years with 365 and number
* of months with 30 - add these two to get the total number of days.
* */

public class AgeInDays {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 2 integer values for age in Years and Months respectively : ");
        int years = obj.nextInt();
        int months = obj.nextInt();

        int totalNumberOfDays = (years * 365) + (months * 30);
        System.out.println("The age of a person is " + totalNumberOfDays + " days.");
    }
}
