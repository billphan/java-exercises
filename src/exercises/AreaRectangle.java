// Exercise #2:
// Numeric types: Write a program to calculate the area of a rectangle and print the answer to the console. You should prompt the user for the dimensions. (What data types should the dimensions be?)

package exercises;

import java.util.Scanner;

public class AreaRectangle {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        // area = length * width
        double area = length * width;
        System.out.println("The area of the rectangle is " + length + " in length.");
        System.out.println(width + " in width, and has an area of " + area);
    }
}