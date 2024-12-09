package mathematical;
/*
* QUESTION - Write a program that counts the number of digits in the number 56974215 and prints it.
*
* SOLUTION - so, to count the number of digits in the given number, you have 2 ways
* Approach 1 - if you convert the number to a String and then find the length of the string, you will get the
*               number of digits.
*
* Approach 2 - if you keep dividing the number by 10 until it becomes zero and keep a track of how many times
*               you have divided, then, you will get the number of digits.
*
* */
public class Loops14 {
    public static int approach1(int input) {
        int totalDigits = 0;
        String convertedNumber = Integer.toString(input);
        // You can do it like this as well :  String convertedNumber = String.valueOf(input);
        totalDigits = convertedNumber.length();
        return totalDigits;
    }

    public static int approach2(int input) {
        int totalDigits = 0;
        while(input > 0) {
            input /= 10;
            totalDigits++;
        }
        return totalDigits;
    }

    public static void main(String[] args) {
        int number = 56974215;
        System.out.println("Total number of digits in the number " + number + " is equal to " + approach1(number));
        System.out.println("Total number of digits in the number " + number + " is equal to " + approach2(number));
    }
}