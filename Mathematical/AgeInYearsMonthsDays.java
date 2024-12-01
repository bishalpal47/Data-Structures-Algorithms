package mathematical;

import java.util.Scanner;
/*
* QUESTION - Write a program that takes the number of days a person as lived (i.e. his age) from the user and
* prints his age in years, months and days. Assume there are 365 days in 1 year and 30 days in 1 month.
*
* SOLUTION - Each year contains 365 days.
* First, see how many days can be converted into years.
* Then, see how many days are remaining after that conversion.
* Now, each month has 30 days. So, out of the remaining days, check how many months can be formed using those days.
* After the months conversion, the remaining days can be displayed as it is.
*
* For example, totalDays = 410.
* numberOfYears = totalDays / 365       -- well, each year contains 365 days.       = 1
* after calculating numberOfYears, we have to check how many days are remaining.
* so, remainingDays = totalDays % 365   -- this will give us the remainder days.    = 45
* numberOfMonths = remainingDays / 30   -- number of months                         = 1
* remainingDays = remainingDays % 30    -- this will give us the remainder days.    = 15
* so 410 days --> 1 year, 1 month, 15 days.
* */
public class AgeInYearsMonthsDays {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        System.out.print("Enter the number of days you have lived: ");
        int totalDays = myObject.nextInt();
        myObject.close();

        // Calculating years, months, and days
        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;
        int months = remainingDaysAfterYears / 30;
        int days = remainingDaysAfterYears % 30;

        // Displaying the result
        System.out.println("You are " + years + " years, " + months + " months and " + days + " days old.");
    }
}
