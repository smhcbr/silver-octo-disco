package week2.sherlocknArray;

import java.util.*;

public class Solution {
    public static String balancedSums(List<Integer> arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num; // Dizinin toplamını hesapla
        }

        int leftSum = 0; // Sol taraftaki toplam
        for (int num : arr) {
            if (leftSum == totalSum - leftSum - num) {
                return "YES"; // Koşulu sağlayan eleman bulundu
            }
            leftSum += num; // Sol toplamı güncelle
        }
        return "NO"; // Hiçbir eleman koşulu sağlamadıysa
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Test case sayısı
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt(); // Dizi boyutu

            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }

            System.out.println(balancedSums(arr)); // Sonucu ekrana yazdır
        }

        scanner.close();
    }
}
