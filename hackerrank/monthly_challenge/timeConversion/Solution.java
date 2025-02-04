package timeConversion;
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
    public static String timeConversion(String s) {
        if (s.charAt(8) == 'P') {
            if (Integer.parseInt(s.substring(0, 2)) < 12) {
                String res = String.valueOf(Integer.parseInt(s.substring(0, 2)) + 12);
                res = res.concat(s.substring(2, 8));
                return res;
            } else return s.substring(0, 8);
        } else {
            if (Integer.parseInt(s.substring(0, 2)) < 12) {
                return s.substring(0, 8);
            } else {
                String res = "00";
                res = res.concat(s.substring(2, 8));
                return res;
            }
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
