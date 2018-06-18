// This is a test
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        // creat scanner object
        Scanner inputReader = new Scanner(System.in);

        // prompt user for name
        System.out.print("What is your name? ");
        String userName = inputReader.nextLine();

        // great user
        System.out.println("Hello, " + userName + "!");
        System.out.println();

        // promt user for age
        System.out.print("How old are you? ");
        int userAge = inputReader.nextInt();

        // checks if user is old enough
        if (userAge < 18) {
            System.out.println("Adults Only!");
        } else {
            System.out.println("Welcome.");
        }

        // close scanner object
        inputReader.close();
    }
}