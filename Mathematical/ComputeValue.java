package mathematical;
/*
* Question - Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
*
* Solution - Since you have to take input from user, you can use either Scanner or BufferedReader.
* Choose any 1 and create its object. Import these classes properly.
* Take the input from the user AFTER you give some message using print().
* Close the object after using it.
* Do the computation properly and store it in a new variable of "int" type because you are computing an integer value.
*
* */
import java.util.Scanner;

public class ComputeValue {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        System.out.print("Enter a value for 'n' : ");
        int n = myObject.nextInt();
        myObject.close();

        int result = n + n*n + n*n*n;
        System.out.println("The computed value of  n + n*n + n*n*n is equal to " + result);

        /*
        *           ALTERNATE SOLUTION
        * ==================================================
        * you must import BufferedReader, InputStreamReader and IOException classes from their
        * respective packages.
        *
        * The main() will look like this
        * public static void main(String [] args) throws IOException {
        *
        * BufferedReader myObject = new BufferedReader(new InputStreamReader(System.in));
        * System.out.println("Enter the value for n : ");
        * int n = Integer.parseInt(myObject.readLine());
        * myObject.close();
        *
        * int result = n + n*n + n*n*n;
        * System.out.println("The computed value of  n + n*n + n*n*n is equal to " + result);
        *
        * }
        * */

    }
}
