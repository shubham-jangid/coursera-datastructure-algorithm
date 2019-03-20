package algorithm_toolbox.week2;

import java.util.Scanner;

public class greatesCommonDevisor {

//    public static int gcdSlow(int a, int b) {
//        int d = 0;
//        for (int i = 1; i <= a + b; i++) {
//            if (a % i == 0 && b % i == 0) {
//                d = i;
//            }
//        }
//        return d;
//    }
    public static int gcdFast(int a, int b){
        if(b==0)return a;
        int c = a%b;
        return gcdFast(b,c);
    }

    public static void main(String[] args) {

        //stress test
//        while(true){
//            int a=(int)((Math.random())*100000+1);
//            int b=(int)((Math.random())*12350+1);
//
//            int d1=gcdSlow(a,b);
//            int d2=gcdFast(a,b);
//            System.out.println(d1 + "  " +d2);
//            if(d1==d2){
//                System.out.println("correct");
//            }
//            else {
//                System.out.println("wrong");
//                break;
//            }
//
//        }

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcdFast(a,b));

//        System.out.println(gcdSlow(a, b));
    }

}
