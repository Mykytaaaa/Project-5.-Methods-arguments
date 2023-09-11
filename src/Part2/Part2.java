package Part2;

import java.util.Scanner;

/**
 * Main block:
 * 0. Ask the user to input their favorite genre and book size.
 * 1. Suggest the user a book to read using switch-case condition. There is one
 * switch-case for big books and one for small ones.
 * 2. Run the GetUserString block with argument "Continue?"; if user prints y or Y goto #0.
 *
 * GetUserString block:
 * 0. Print a question (parameter 1).
 * 1. return the user input.
 *
 * AskIfContinue block:
 * 0. run getUserString block.
 * 1. return true if user answer equals y or Y; otherwise, return false.
 *
 * println block:
 * 0. output a text (parameter 1) to the console and add a break.
 *
 * print block:
 * 0. output a text (parameter 1) to the console.
 */
public class Part2 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        do {
            String genre = getUserString("What is your favorite genre");
            println("What is your favorite book size (pages)?");
            int bookSize = in.nextInt();
            print("Probably, you would like ");
            //Choose by size
            if (bookSize >= 400) {
                //Choose by genre
                switch (genre)
                {
                    case "detective" -> println("Sherlock Holmes");
                    case "science fiction" -> println("I, robot");
                    case "fantasy" -> println("Harry Potter");
                    default -> println("Tyhrolovy");
                }
            }
            else {
                //Choose by genre
                switch (genre)
                {
                    case "detective" -> println("Sherlock Holmes");
                    case "science fiction" -> println("some of the Robert Sheckley's stories");
                    case "fantasy" -> println("Mio, min Mio");
                    case "Ukrainian", "ukrainian" -> println("Haidamaky");
                    default -> println("Farbovany lys");
                }
            }
        } while (askIfContinue());
    }

    public static String getUserString(String question) {
        println(question);
        return in.nextLine();
    }

    public static boolean askIfContinue() {
        in.nextLine();
        String answer = getUserString("Continue?");
        return answer.equals("y") || answer.equals("Y");
    }

    public static void println(String text) {
        System.out.println(text);
    }

    public static void print(String text) {
        System.out.print(text);
    }
}
