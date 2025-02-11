package week2.caesarCipher;

import java.util.Scanner;

class Result {
    public static String caesarCipher(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if ( c >= 'a' && c<='z'){
                c = (char) ('a' + ( c- 'a' + k) % 26);
            }else if (c >= 'A' && c<='Z'){
                c = (char) ('A' + ( c- 'A' + k) % 26);
            }
            sb.append(c);
        }
        return sb.toString();
    }

}

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        int j = Integer.parseInt(sc.nextLine());
        String cipher = Result.caesarCipher(s, j);
        System.out.println(cipher);
    }
}
