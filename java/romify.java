// convert integer input into Roman Numeral String

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class romify {

    public static String Rome(int input) {

        if (input <= 0 || input >= 4000) {
            return null;
        }

        Map <String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D",  500);
        map.put("CD", 400);
        map.put("C",  100);
        map.put("XC",  90);
        map.put("L",   50);
        map.put("XL",  40);
        map.put("X",   10);
        map.put("IX",   9);
        map.put("V",    5);
        map.put("IV",   4);
        map.put("I",    1);

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Integer> kv : map.entrySet()) {
            while (input >= kv.getValue()) {
                sb.append(kv.getKey());
                input -= kv.getValue();
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter input: ");
        int userInput = s.nextInt();
        System.out.println(Rome(userInput));

        s.close();
    }
}