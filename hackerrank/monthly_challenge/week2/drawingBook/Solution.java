package week2.drawingBook;

import java.util.Scanner;



public class Solution {

    public static int pageCount(int n, int p) {
        int half = n / 2;
        if(p <= half){
            return p / 2;
        }
        return half - (p / 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = pageCount(n, p);
        System.out.println(result);
    }
}
