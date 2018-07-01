// dice game

import java.util.Random;

public class Dice {

    public static void six() {
        System.out.println("---------\n| *   * |\n| *   * |\n| *   * |\n---------");
    }

    public static void five() {
        System.out.println("---------\n| *   * |\n|   *   |\n| *   * |\n---------");
    }

    public static void four() {
        System.out.println("---------\n| *   * |\n|       |\n| *   * |\n---------");
    }

    public static void three() {
        System.out.println("---------\n|     * |\n|   *   |\n| *     |\n---------");
    }

    public static void two() {
        System.out.println("---------\n|     * |\n|       |\n| *     |\n---------");
    }

    public static void one() {
        System.out.println("---------\n|       |\n|   *   |\n|       |\n---------");
    }

    public static void main(String[] args) {

        six();
        five();
        four();
        three();
        two();
        one();
    }
}