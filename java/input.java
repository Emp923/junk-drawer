import java.util.Scanner;
public class input {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // great the user and prompt them to enter a start from, end with, and
        // incrememnt value

        System.out.print("Enter a kilometer value to start at: ");
                // prints out a message
        String value = input.nextLine();
        int kilometerStart = Integer.parseInt(value);
                // saves what the user types in
        System.out.print("Enter a kilometer value to end with: ");
        value = input.nextLine();
        int kilometerEnd = Integer.parseInt(value);

        System.out.print("How many should it increment by: ");
        value = input.nextLine();
        int incrementBy = Integer.parseInt(value);

        System.out.println("Going from " + kilometerStart + "km to " + kilometerEnd + "km in increments of " + incrementBy + "km.");

        // print out each value converted into miles from start from to end 
        // with
        for (int i = kilometerStart; i <= kilometerEnd; i += incrementBy) {
            double miles = kilometersToMiles(i);
            System.out.println(i + "km is " + miles + "mi.");
        }

        input.close();
    }

    static public double kilometersToMiles(int kilometers) {
        double miles = kilometers * 0.621371;
        return miles;
    }

}