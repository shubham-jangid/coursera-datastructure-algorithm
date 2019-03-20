package algorithm_toolbox.week2;//package week2;

import java.util.Scanner;

public class leastCommomMultiple {

    public static int greatestCommonDivisior(int a , int b){
        if(b==0)return a;
        int c = a%b;
        return greatestCommonDivisior(b,c);
    }

    public static long lsmSlow(long a, long b ,long gcd){
        return Math.multiplyExact(a,b)/gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = greatestCommonDivisior(a,b);

        System.out.println(lsmSlow(a,b,gcd));
    }
}

//17657