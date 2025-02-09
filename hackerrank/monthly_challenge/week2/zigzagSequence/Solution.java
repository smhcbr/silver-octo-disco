package week2.zigzagSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            findZigZagSequence(arr, n);
        }
        sc.close();
    }
    public static void findZigZagSequence(int[] arr, int n){
        Arrays.sort(arr);
        int mid = (n - 1)/2;

        int temp = arr[mid];
        arr[mid] = arr[n - 1];
        arr[n - 1] = temp;

        int left = mid + 1;
        int right = n - 2;
        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for(int i = 0; i < n; i++){
            if(i > 0)
                System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
