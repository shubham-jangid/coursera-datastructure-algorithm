package algorithm_toolbox.week3;//package algorithm_toolbox.week3.week4.week3;

import java.util.Scanner;

public class MoneyChange
{
    public  static int MoneyChange(int n){
        int coin=0;
        coin= coin + n/10;
        n= n%10;
        coin = coin+n/5;
        n=n%5;
        coin = coin + n;
        return coin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt();
        System.out.println(MoneyChange(inputValue));
    }

}
