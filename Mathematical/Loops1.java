package mathematical;

public class Loops1 {
    public static void main(String[] args) {
        System.out.println("Printing numbers from 1 to 5 : ");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println();       // using this statement to print a new line.
        System.out.println("Printing the numbers in 1 line : ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}