package week2.dynamicArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new ArrayList<>());
        }
        List<Integer> result = new ArrayList<>();
        int lastAnswer = 0;

        for(List<Integer> query: queries){
            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int idx = (x ^ lastAnswer) % n;

            if(type == 1)
                arr.get(idx).add(y);
            else if(type == 2){
                int elementIndex = y % arr.get(idx).size();
                lastAnswer = arr.get(idx).get(elementIndex);
                result.add(lastAnswer);
            }
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();

        List<List<Integer>> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            List<Integer> query = new ArrayList<>();
            query.add(scanner.nextInt());
            query.add(scanner.nextInt());
            query.add(scanner.nextInt());
            queries.add(query);
        }
        scanner.close();

        List<Integer> result = Result.dynamicArray(n, queries);

        for (int ans : result) {
            System.out.println(ans);
        }
    }
}
