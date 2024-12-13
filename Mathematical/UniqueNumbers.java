package mathematical;
/*
* QUESTION - "Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit
* numbers are there. There cannot be any repeated digits in the same number.
* For example : 112 - Here 1 is being repeated 2 times. You must not print such numbers."
*
* SOLUTION - You have to use loops to generate all possible combinations.
* Since you have to create a 3-digit number, you have to use 3 loops which will generate all the possible numbers.
* now, out of all the possible numbers, you have to print only the UNIQUE numbers (no digit repetition)
*
* step-by-step explanation of the code I have provided :
* Nested Loops:
The program uses three nested for loops:
i represents the hundreds place.
j represents the tens place.
k represents the units place.
Each loop iterates through the values 1, 2, 3, 4.

* Condition to Ensure Unique Digits:
The condition if (i != j && j != k && i != k) ensures that the digits in the three places are distinct.
Without this condition, numbers like 111, 122, or 212 could appear, which violates the "unique digits" requirement.

* Constructing and Printing Numbers:
For every valid combination of i, j, and k, the three-digit number is constructed using:
        i * 100 + j * 10 + k
i * 100 represents the hundreds place.
j * 10 represents the tens place.
k is the units place.

* Counting Unique Numbers:
Each time a valid number is generated (meeting the unique digits condition), the count variable is incremented by 1.
* */

public class UniqueNumbers {
    public static void main(String[] args) {
        int count = 0;

        System.out.println("Unique three-digit numbers:");

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.print((i * 100 + j * 10 + k) + " ");
                        count++;
                    }
                }
            }
            System.out.println();
        }

        System.out.println("Total unique three-digit numbers: " + count);
    }
}

/*
*                       OUTPUT
* ====================================================
Unique three-digit numbers:
123 124 132 134 142 143
213 214 231 234 241 243
312 314 321 324 341 342
412 413 421 423 431 432
Total unique three-digit numbers: 24
* */