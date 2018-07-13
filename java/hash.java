// half hash program

import java.util.Scanner;

public class hash {

    public static int getNum() {

        Scanner scan = new Scanner(System.in);

        int x;
        System.out.print("Enter int for number of rows: ");
        x = scan.nextInt();

        return x;
    }

    public static void main(String[] args) {

        int rows = getNum();

        for (int x = rows; x >= 1; x--) {

            for (int y = 1; y <= x; y++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}