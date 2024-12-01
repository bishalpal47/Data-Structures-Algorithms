package mathematical;

import java.util.Scanner;

/*
* QUESTION - Write a Java program that accepts an integer (n) and prints it with the message "Hello, you entered
* the number <input_number_here>
*
* SOLUTION - Since you have to take input from user, you can use either Scanner or BufferedReader.
* Choose any 1 and create its object. Import these classes properly.
* Take the input from the user AFTER you give some message using print().
* Close the object after using it.
* Print the statement as mentioned in the question.
* */

public class TakeInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a number : ");      // you can use the println() as well.
        int a = myObj.nextInt();
        myObj.close();

        System.out.println("Hello, you entered the number : " + a);
    }
}

/*          ALTERNATE APPROACH
===============================================
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeInput {
    public static void main(String[] args) throws IOException {
        BufferedReader myObj = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number : ");
        int a = Integer.parseInt(myObj.readLine());
        myObj.close();

        System.out.println("Hello, you entered the number : " + a);
    }
}
*/