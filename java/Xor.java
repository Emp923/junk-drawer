// Bitwise XOR Swap

public class Xor {
    public static void main(String[] args) {
        int x = 7;
        int y = 19;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}