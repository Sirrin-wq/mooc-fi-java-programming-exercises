package fi.mooc.javaProgrammingPart1.Part01_09_Conversation;

import java.util.Scanner;

/*
Write a program that works as follows:

Sample output
Greetings! How are you doing?
Good thank you!
Oh, how interesting. Tell me more!
Well, there's really nothing to tell.
Thanks for sharing!
 */
public class Conversation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Greetings! How are you doing?");
        String answer = scan.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        answer = scan.nextLine();
        System.out.println("Thanks for sharing!");
    }
}
