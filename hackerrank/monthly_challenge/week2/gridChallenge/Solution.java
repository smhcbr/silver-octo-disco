package week2.gridChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Result {

    public static String gridChallenge(List<String> grid) {
        int[][] values = new int[grid.size()][grid.get(0).length()];
        for (int i=0 ; i<grid.size() ; i++) {
            char[] chars = grid.get(i).toCharArray();
            Arrays.sort(chars);

            for (int j=0 ; j<chars.length ; j++) {
                values[i][j] = (int) chars[j];
                if (i > 0 && values[i-1][j] > values[i][j]) {
                    return "NO";
                }
            }
        }
        return "YES";
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Matris boyutu
        scanner.nextLine(); // Satır atlamasını engellemek için

        List<String> grid = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            grid.add(scanner.nextLine()); // Grid satırlarını oku
        }
        scanner.close();

        System.out.println(Result.gridChallenge(grid));
    }
}
