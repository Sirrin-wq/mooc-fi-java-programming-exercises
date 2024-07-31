package fi.mooc.javaProgrammingPart1.Part01_08_Greeting;

import java.util.Scanner;

/*
Write a program that prompts the user for their name with the
message "What's your name?". When the user has written their name,
the program has to print "Hi " followed by the user's name.
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scan.nextLine();
        System.out.println("Hi " + name);
    }
}
