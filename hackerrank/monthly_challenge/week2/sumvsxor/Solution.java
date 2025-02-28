package week2.sumvsxor;

import java.util.Scanner;

class Result{

    public static long sumvsxor(long n) {
        if (n == 0) return 1;

        String binary = Long.toBinaryString(n);
        int zeros = (int) binary.chars()
                .filter(ch -> ch == '0').count();
        return (long) Math.pow(2, zeros);
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = Result.sumvsxor(n);
        System.out.println(result);
    }
}
