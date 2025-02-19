package week2.recursiveDigitSum;

import java.util.Scanner;

class Result {

    private static int superDigitHelper(long num){
        if(num < 10)
            return (int)num;
        long toplam = 0;
        while(num > 0){
            toplam += num % 10;
            num /= 10;
        }

        return superDigitHelper(toplam);
    }

    public static int superDigit(String n, int k) {
        long toplam = 0;
        for(int i = 0; i < n.length(); i++)
            toplam += (n.charAt(i) - '0');
        long sonToplam = toplam * k;

        return superDigitHelper(sonToplam);
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int k = sc.nextInt();

        int result = Result.superDigit(n, k);
        System.out.println(result);

        sc.close();
    }
}
