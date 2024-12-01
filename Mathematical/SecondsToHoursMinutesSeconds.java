package mathematical;

import java.util.Scanner;
/*
* QUESTION - Write a program which takes total number of seconds from the user and prints the
* number of hours, minutes and seconds
*
* SOLUTION - Each hour contains 3600 seconds. Each minute contains 60 seconds.
* So, first see how many hours can be made out of the total number of seconds i.e. (totalSeconds / 3600).
* After this conversion, you will still be left with some number of seconds i.e. (remainingSeconds = totalSeconds % 3600).
* Use these seconds to find the number of minutes you can make i.e. (remainingSeconds / 60)
* After this conversion, you may still be left with some number of seconds i.e. (remainingSeconds % 60) - these can't be made into minutes anymore.
*
*
* for example, let's say totalSeconds = 3965
* numberOfHours = totalSeconds / 3600           = 1
* remainingSeconds = totalSeconds % 3600        = 365
* numberOfMinutes = remainingSeconds / 60       = 6
* numberOfSecondsLeft = remainingSeconds % 60   = 5
*
* so, 3965 seconds = 1 hour, 6 minutes, 5 seconds.
* */
public class SecondsToHoursMinutesSeconds {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        System.out.print("Enter the total number of seconds: ");
        int totalSeconds = myObject.nextInt();
        myObject.close();

        // Calculating hours, minutes, and seconds
        int hours = totalSeconds / 3600;
        int remainingSecondsAfterHours = totalSeconds % 3600;
        int minutes = remainingSecondsAfterHours / 60;
        int seconds = remainingSecondsAfterHours % 60;

        // Displaying the result
        System.out.println(totalSeconds + " seconds = " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
    }
}

/*
*                   OUTPUT
* ============================================
* Enter the total number of seconds: 9876
* 9876 seconds = 2 hours, 44 minutes, and 36 seconds.
*
* */