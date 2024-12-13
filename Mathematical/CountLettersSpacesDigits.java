package mathematical;
/*
* QUESTION - Write a Java program to count letters, spaces, numbers and other characters in an input string.
*
* SOLUTION - Don't be scared of this question. It is actually pretty simple.
* There are many approaches to solve this question, however, I will provide you two approaches - these are pretty simple.
*
* APPROACH 1 - Use the in-built Character class and it's methods.
* Java has Character class. It has many useful methods like - isLetter(), isDigit(), isWhitespace()
* you can use these 3 to keep track of letters, digits and whitespaces respectively. For other characters, just
* keep track of it using another variable.
*
* APPROACH 2 - I told you about ASCII values associated with each character. You can use that.
* Categorization using ASCII Ranges:
* Letters:
*   Uppercase (A-Z): ASCII values 65-90.
*   Lowercase (a-z): ASCII values 97-122.
* Numbers (0-9): ASCII values 48-57.
* Spaces: ASCII value 32.
* Other characters: Any character outside these ranges.
*
* now, you can either use this information I mentioned above OR, do it like I have done in the method - approach2().
*
* */
import java.util.Scanner;

public class CountLettersSpacesDigits {
    public static void approach1(String input) {
        int letters = 0, spaces = 0, numbers = 0, others = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                numbers++;
            } else if (Character.isWhitespace(c)) {
                spaces++;
            } else {
                others++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Other characters: " + others);
    }

    public static void approach2(String input) {
        int letters = 0, spaces = 0, numbers = 0, others = 0;

        for (char c : input.toCharArray()) {
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                // ASCII value for uppercase and lowercase letters
                letters++;
            } else if (c >= '0' && c <= '9') {
                // ASCII value for digits
                numbers++;
            } else if (c == ' ') {
                // ASCII value for space
                spaces++;
            } else {
                // Everything else
                others++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Other characters: " + others);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // approach1(input);        // you may uncomment this line. Answer is the same as approach2()
        approach2(input);
    }
}

/*
*                       OUTPUT
* ===================================================
Enter a string: Hello123@$% i    am not j@k!ng !!!!####
Letters: 15
Spaces: 8
Numbers: 3
Other characters: 13
* */