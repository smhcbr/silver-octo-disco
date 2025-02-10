package week2.towerBreakers;

import java.util.Scanner;

class Result{
    public static int towerBreakers(int n, int m) {

        if (n%2 == 0 || m == 1) return 2;
        return 1;
    }
}

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int result = 0;
        while (t-- > 0) {
            int n = in.nextInt();
            int m = in.nextInt();
            result = Result.towerBreakers(n, m);
        }
        in.close();
        System.out.println(result);
    }
}
