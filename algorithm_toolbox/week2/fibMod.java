package algorithm_toolbox.week2;

import java.util.Arrays;
import java.util.Scanner;

public class fibMod {
    public static int[] fibFast(int n) {
//        if (n == 0) return 0;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2])%5;
        }
        return arr;
    }



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println(Arrays.toString(fibFast(n)));
//        System.out.println(fibSlow(n ));


    }
}
