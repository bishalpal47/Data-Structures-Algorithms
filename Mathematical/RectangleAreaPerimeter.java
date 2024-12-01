package mathematical;

import java.util.Scanner;
/*
* QUESTION - Write a program that takes length and width of rectangle and then print the
* area and perimeter of a rectangle.
* */
public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = obj.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = obj.nextDouble();
        obj.close();

        // Calculating area and perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Displaying results
        System.out.println("\nArea of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
