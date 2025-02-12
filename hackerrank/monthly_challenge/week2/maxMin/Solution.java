package week2.maxMin;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Result{
    public static int maxMin(int k, List<Integer> arr){
        Collections.sort(arr);
        List<Integer> newList = List.of();
        for(int i = 0; i < k; i++){
            newList.set(i, arr.get(i));
        }
        int max = newList.getLast() + newList.getFirst();
        int min = newList.getLast() - newList.getFirst();
        return (max - min);
    }
}
public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> arr = List.of();
        for(int i = 0; i < k; i++){
            int count = sc.nextInt();
            arr.set(i, count);
        }
        int result = Result.maxMin(n, arr);
        System.out.println(result);
    }
}
