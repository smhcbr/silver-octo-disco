package week1.mockTest.flippingMatrix;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'flippingMatrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int n = matrix.size() / 2;
        int maxSum = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int maxVal = Math.max(
                        Math.max(matrix.get(i).get(j), matrix.get(i).get(2 * n - j - 1)),
                        Math.max(matrix.get(2 * n - i - 1).get(j), matrix.get(2 * n - i - 1).get(2 * n - j - 1))
                );
                maxSum += maxVal;
            }
        }
        return maxSum;

    }

}