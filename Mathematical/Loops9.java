package mathematical;

/*
* QUESTION - Write a program that prints all the factors of the number 7832;
*
* SOLUTION - Factors of a number, say 'n' means those numbers which can completely divide n (i.e. remainder = 0)
* you can find a n
* */
public class Loops9 {
    public static void main(String[] args) {
        int number = 7832;
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
