package algorithm_toolbox.week3;
//package algorithm_toolbox.week3;

import java.util.*;

public class DifferentSummands {
    private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        //write your code here
        for(int i = 1 ; i<=n ; i++){
            int temp;
            temp = n-i;
            if(temp==0){
                summands.add(i);
                break;
            }
            if(temp<=i){
                summands.add(n);
                break;
            }
            else{
                summands.add(i);
            }
            n=temp;

        }
        return summands;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}

