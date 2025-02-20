package week2.counterGame;

import java.util.Scanner;

class Result {
    public static String counterGame(long n) {
        int hamle = 0;
        while(n > 1){
            long enYuksek = Long.highestOneBit(n);

            if(enYuksek == n)
                n /= 2;
            else
                n -= enYuksek;

            hamle++;
        }
        if(hamle % 2 == 1)
            return "Louise";
        else
            return "Richard";

    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Test case sayısı
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong(); // Oyunun başındaki sayı
            System.out.println(Result.counterGame(n));
        }

        sc.close();
    }
}
