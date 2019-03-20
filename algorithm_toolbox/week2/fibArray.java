package algorithm_toolbox.week2;

import java.util.Scanner;

public class fibArray {
    public static int fibFast(int n) {
        if (n == 0) return 0;
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n - 1];
    }

//    public static int fibSlow(int n) {
//        if (n <= 2) {
//           return 1;
//        }
//        return fibSlow(n - 1) + fibSlow(n - 2);
//    }

    public static void main(String[] args) {
        //test case
//        while (true) {
//            int n = (int) ((Math.random()) * 5+1);
//            System.out.println(n);
//            int b = fibSlow(n);
//            int a = fibFast(n);
//            System.out.print(a + "  " + b);
//            if(a==b){
//                System.out.println("pass");}
//                else {
//                System.out.println("fail");
//                break;
//            }
//
//        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.println(fibFast(n));
//        System.out.println(fibSlow(n ));


    }
}
