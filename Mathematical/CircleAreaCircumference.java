package mathematical;

import java.util.Scanner;
/*
* QUESTION - Write a program that takes the radius of a circle from user as input to print the area and perimeter of a circle.
*
* SOLUTION - You can use the value for Pi(π) from the Math class in Java.
* Math class has the property named "PI". You can access it like this -  Math.PI
 * */
public class CircleAreaCircumference {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = myObj.nextDouble();
        myObj.close();

        // Calculating area and perimeter
        double area = Math.PI * radius * radius; // Area formula: π * r^2
        double perimeter = 2 * Math.PI * radius; // Perimeter formula: 2 * π * r

        // Displaying results
        System.out.println("\nArea of the circle: " + area);
        System.out.println("Perimeter (Circumference) of the circle: " + perimeter);
    }
}

