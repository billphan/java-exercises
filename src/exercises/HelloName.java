// Exercise #1:
// Input/output: Modify your "Hello, World" program to prompt the user for their name, and greet them by name.

package exercises;

import java.util.Scanner;

public class HelloName {

    public static void main(String[] args) {
        //write code you want to execute here
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What's your name?");
        String name = input.nextLine();
        System.out.println("Hello! " + name + "! It's nice to meet you.");
    }

}