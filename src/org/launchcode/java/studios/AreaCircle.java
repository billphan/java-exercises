// Write a program/class Area that prompts the user for a number,
// and then calculate the area of a circle with that radius and print the result.
// Recall that the area of a circle is A = pi * r * r
// where pi is 3.14 and r is the radius.

package org.launchcode.java.studios;

import java.util.Scanner;

public class AreaCircle {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Enter a radius: ");
        double r = scanner.nextDouble();
        double area = pi * r * r;
        System.out.println("The area of the circle is " + area + ".");

    }

}