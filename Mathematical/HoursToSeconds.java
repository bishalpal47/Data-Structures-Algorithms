package mathematical;

import java.util.Scanner;

/*
* QUESTION - Write a program which takes number_of_hours and number_of_minutes as input from user and passes
* it to a function which converts the hours and minutes to seconds.
*
* SOLUTION - 1 hour contains 60 minutes. 1 minute contains 60 seconds.
* So, 1 hour contains 60 * 60 seconds.
* */
public class HoursToSeconds {
    public static int calculateSeconds(int hours) {
        int seconds = 0;
        seconds = hours * 60 * 60;

        return seconds;
    }

    public static void main(String [] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of hours : ");
        int numberOfHours = myObj.nextInt();
        myObj.close();

        int numberOfSeconds = calculateSeconds(numberOfHours);
        System.out.println("There are " + numberOfSeconds + " seconds in " + numberOfHours + " hours.");
    }
}
