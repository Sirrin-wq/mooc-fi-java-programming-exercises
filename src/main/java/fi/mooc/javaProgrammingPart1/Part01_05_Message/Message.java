package fi.mooc.javaProgrammingPart1.Part01_05_Message;

import java.util.Scanner;


// Make user enter a message and display it
public class Message {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");

        String message = scanner.nextLine();

        System.out.println(message);

        scanner.close();
    }
}
