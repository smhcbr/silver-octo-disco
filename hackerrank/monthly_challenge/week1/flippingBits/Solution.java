package week1.flippingBits;

import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class Result {

        /*
         * Complete the 'week1.flippingBits' function below.
         *
         * The function is expected to return a LONG_INTEGER.
         * The function accepts LONG_INTEGER n as parameter.
         */

        public static long flippingBits(long n) {

            String binary = Long.toBinaryString(n);
            while (binary.length() != 32)
                binary = '0' + binary;

            binary = binary.replace("1", "3");
            binary = binary.replace("0", "1");
            binary = binary.replace("3", "0");

            return Long.parseLong(binary, 2);


        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int q = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, q).forEach(qItr -> {
                try {
                    long n = Long.parseLong(bufferedReader.readLine().trim());

                    long result = Result.flippingBits(n);

                    bufferedWriter.write(String.valueOf(result));
                    bufferedWriter.newLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

