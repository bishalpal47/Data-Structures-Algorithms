package mathematical;
/*
* QUESTION - "Write a function that takes a string, breaks it up and returns it with vowels first,
* consonants second. For any character that's not a vowel (like special characters or spaces),
* treat them like consonants.

Examples
split(""abcde"") ➞ ""aebcd""
split(""Hello!"") ➞ ""eoHll!""
split(""What's the time?"") ➞ ""aeieWht's th tm?"""
*
*
*
* SOLUTION -
* The question might look complicated, but, it's pretty simple.
*
* you have to pick the vowels from the input string first and store it somewhere.
* then you pick all the consonants from the input string and store it in some other variable.
* just add those two variables, and you will get your solution.
*
* So, STEP 1 - Get the vowels.
* you know that there are only 5 vowels: a, e, i, o, u.
* so, you run a loop over the input string and check each character - is it a vowel?
* if yes, then, add it to a variable named "vowels"
* if no, then, add it to the variable named "consonant"
*
* once you are done traversing the input string, just add the variables - vowel and consonant - that's your answer.
* */
public class VowelConsonantSplit {
    // Approach 1
    public static String rearrange(String str) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        String vowelSet = "AEIOUaeiou";

        for (char ch : str.toCharArray()) {
            if (vowelSet.indexOf(ch) != -1) {
                vowels.append(ch);
            } else {
                consonants.append(ch);
            }
        }

        return vowels.toString() + consonants.toString();
    }


    // if you try to use any other approach, that will also work. But, you just have to write more code.
    // Approach 2
    public static String rearrange2(String str) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for(int i = 0; i<str.length(); i++) {
            char temp = str.charAt(i);
            if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' ||
                temp =='A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U'
            ) {
                vowels.append(temp);
            } else {
                consonants.append(temp);
            }
        }

        return vowels.toString() + consonants.toString();
    }

    public static void main(String[] args) {
        System.out.println(rearrange("abcde")); // Output: "aebcd"
        System.out.println(rearrange("Hello!")); // Output: "eoHll!"
        System.out.println(rearrange("What's the time?")); // Output: "aeieWht's th tm?"
    }

}

