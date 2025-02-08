package week1.xorStrings2;

import java.util.*;

public class Solution {

    public static String xorStrings(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int len = s1.length();
        for (int i = 0; i < len; i++) {
            if(s1.charAt(i) == s2.charAt(i))
                sb.append("0");
            else
                sb.append("1");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        String xor = xorStrings(s1, s2);

        System.out.println(xor);
        scanner.close();
    }
}
