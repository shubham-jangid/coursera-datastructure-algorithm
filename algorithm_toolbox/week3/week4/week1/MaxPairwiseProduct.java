package algorithm_toolbox.week3.week4.week1;//package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class MaxPairwiseProduct {
    static long getMaxPairwiseProductFast(int[] numbers) {
        int nSize = numbers.length;

        int max_index1 = -1;
        for (int i = 0; i < nSize; i++) {
            if ((max_index1 == -1) || (numbers[i] > numbers[max_index1]))
                max_index1 = i;
        }

        int max_index2 = -1;
        for (int j = 0; j < nSize; j++) {
            if ((j != max_index1) && ((max_index2 == -1) || (numbers[j] > numbers[max_index2])))
                max_index2 = j;
        }

        return (long)numbers[max_index1] * numbers[max_index2];
    }
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(getMaxPairwiseProductFast(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                        InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}