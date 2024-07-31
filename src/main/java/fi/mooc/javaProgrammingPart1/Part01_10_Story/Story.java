package fi.mooc.javaProgrammingPart1.Part01_10_Story;

import java.util.Scanner;

/*
Write a program that asks the user for a character's name and their job.
The program then prints a short story.

The output must be as shown below — note, the name and job depend on the user's input.

Sample output
I will tell you a story, but I need some information first.
What is the main character called?
Bob (user input)
What is their job?
a builder (user input)
Here is the story:
Once upon a time there was Bob, who was a builder.
On the way to work, Bob reflected on life.
Perhaps Bob will not be a builder forever.
 */
public class Story {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.\n" +
                "What is the main character called?");
        String name = scan.nextLine();
        System.out.println("What is their job?");
        String job = scan.nextLine();
        System.out.println("Here is the story:\n" +
                "Once upon a time there was " + name + ", who was " + job + ".\n" +
                "On the way to work, " + name + " reflected on life.\n" +
                "Perhaps " + name + " will not be " + job + " forever.");
    }
}
