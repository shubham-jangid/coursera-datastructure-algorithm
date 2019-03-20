package algorithm_toolbox.week4;//package week4;

import java.util.Scanner;

      class GFG {

    static void findMajority(int arr[], int n)
    {
        int maxCount = 0;
        int index = -1; // sentinels
        for(int i = 0; i < n; i++)
        {
            int count = 0;
            for(int j = 0; j < n; j++)
            {
                if(arr[i] == arr[j])
                    count++;
            }

            // update maxCount if count of
            // current element is greater
            if(count > maxCount)
            {
                maxCount = count;
                index = i;
            }
        }

        // if maxCount is greater than n/2
        // return the corresponding element
        if (maxCount > n/2)
            System.out.println (arr[index]);

        else
            System.out.println ("0");
    }

    // Driver code
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] arr= new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = scanner.nextInt();
        }

//        int arr[] = {1, 1, 2, 1, 3, 5, 1};
        int n = arr.length;

        // Function calling
        findMajority(arr, n);
    }
//This code is contributed by ajit.
}