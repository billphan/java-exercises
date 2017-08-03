// Exercise #3:
// Numeric types: Write a program that asks a user for the number of miles they have driven and the amount of gas they've consumed (in gallons), and print their miles-per-gallon.

package exercises;

import java.util.Scanner;

public class MilesGallon {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        double miles = scanner.nextDouble();
        System.out.println("How many gallons of gas did you use? ");
        double gallons = scanner.nextDouble();
        // mpg = miles driven / gallons consumed
        double mpg = miles / gallons;
        System.out.println("Your total milage is: " + mpg + " miles per gallon.");
    }
}