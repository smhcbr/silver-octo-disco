package week1.xorStrings2;

import java.util.*;

public class Solution {

    public static String xorStrings(String s1, String s2) {
        String str = new String("");
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == s2.charAt(i))
                str += "0";
            else
                str += "1";
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1;
        s1 = scanner.nextLine();
        String s2;
        s2 = scanner.nextLine();
        System.out.println(xorStrings(s1, s2));
    }
}
