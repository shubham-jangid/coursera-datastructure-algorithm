////package week1;
////
////public class MaxProduct {
////    static int getMaxProduct(int[] number){
////        int product = 0;
////        int n = number.length;
////        for(int i=0; i<n;++i){
////            for(int j=i+1;j<n;++j){
////                product = Math.max(product,(number[i]*number[j]));
////            }
////        }
////        return product;
////
////    }
////
////    public static void main(String args[]){
////        //making stress test
////        while(true){
////            int n;
////
////            n=(int)(Math.random()*10);
////            int[] number = new int[n];
////            for(int k=0; k<n;k++){
////                number[k]=(int)(Math.random()*10);
////            }
////            System.out.println(number);
////
////            System.out.println(getMaxProduct(number));
////
////        }
////
////
//////        int n;
//////        Scanner sc = new Scanner(System.in);
//////        n= sc.nextInt();
//////        int[] number = new int[n];
//////        for(int k=0; k<n;k++){
//////            number[k]=sc.nextInt();
//////        }
//////        System.out.println(getMaxProduct(number));
////    }
////}
//
////package week1;
//
//import java.util.Arrays;
//import java.util.Scanner;
//import java.lang.Math;
//
//public class MaxProduct {
//    static long getMaxProduct(int[] number){
//        long product = 0;
//        int n = number.length;
//        product= Math.multiplyFull(number[n-1],number[n-2] ) ;
//        return product;
//
//    }
//
//    public static void main(String args[]){
//
//
//
//        int n;
//        Scanner sc = new Scanner(System.in);
//        n= sc.nextInt();
//        int[] number = new int[n];
//        for(int k=0; k<n;k++){
//            number[k]=sc.nextInt();
//        }
//        Arrays.sort(number);
//
//        System.out.println(getMaxProduct(number));
//    }
//}
