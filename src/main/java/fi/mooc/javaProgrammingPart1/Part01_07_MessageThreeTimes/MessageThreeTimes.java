package fi.mooc.javaProgrammingPart1.Part01_07_MessageThreeTimes;

import java.util.Scanner;

// print user input three times
public class MessageThreeTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        System.out.println(input);
        System.out.println(input);
        System.out.println(input);
    }
}
