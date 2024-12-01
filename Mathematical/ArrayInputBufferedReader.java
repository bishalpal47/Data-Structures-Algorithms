package mathematical;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArrayInputBufferedReader {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[5];  // Array to store 5 numbers
        BufferedReader myObject = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 5 numbers to store in array : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(myObject.readLine());  // Convert input to integer
        }
        myObject.close();

        // Displaying the numbers
        System.out.print("\nYou entered : ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    /*
    *               OUTPUT
    * ====================================
    * Enter 5 numbers to store in array :
    * 77
    * 88
    * 99
    * 44
    * 55
    *
    * You entered : 77 88 99 44 55
    * */
}


/*                          ALTERNATE APPROACH
==============================================================================
        public static void main(String[] args) throws IOException{
            int [] numbers = new int[5];
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter 5 numbers separated by spaces:");
            String[] input = br.readLine().split(" ");      // Splitting input by spaces
            br.close();

            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(input[i]);
            }

            System.out.print("\nYou entered: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        }

                           OUTPUT
============================================================
Enter 5 numbers separated by spaces:
55 66 44 77 88

You entered: 55 66 44 77 88

*/
