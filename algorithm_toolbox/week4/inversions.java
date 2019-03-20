package algorithm_toolbox.week4;//import java.util.Scanner;
//
//class inversions {
//
//    /* This method sorts the input array and returns the
//       number of inversions in the array */
//    static int mergeSort(int arr[], int array_size)
//    {
//        int temp[] = new int[array_size];
//        return _mergeSort(arr, temp, 0, array_size - 1);
//    }
//
//    /* An auxiliary recursive method that sorts the input array and
//      returns the number of inversions in the array. */
//    static int _mergeSort(int arr[], int temp[], int left, int right)
//    {
//        int mid, inv_count = 0;
//        if (right > left) {
//            /* Divide the array into two parts and call _mergeSortAndCountInv()
//           for each of the parts */
//            mid = (right + left) / 2;
//
//            /* Inversion count will be sum of inversions in left-part, right-part
//          and number of inversions in merging */
//            inv_count = _mergeSort(arr, temp, left, mid);
//            inv_count += _mergeSort(arr, temp, mid + 1, right);
//
//            /*Merge the two parts*/
//            inv_count += merge(arr, temp, left, mid + 1, right);
//        }
//        return inv_count;
//    }
//
//    /* This method merges two sorted arrays and returns inversion count in
//       the arrays.*/
//    static int merge(int arr[], int temp[], int left, int mid, int right)
//    {
//        int i, j, k;
//        int inv_count = 0;
//
//        i = left; /* i is index for left subarray*/
//        j = mid; /* j is index for right subarray*/
//        k = left; /* k is index for resultant merged subarray*/
//        while ((i <= mid - 1) && (j <= right)) {
//            if (arr[i] <= arr[j]) {
//                temp[k++] = arr[i++];
//            }
//            else {
//                temp[k++] = arr[j++];
//
//                /*this is tricky -- see above explanation/diagram for merge()*/
//                inv_count = inv_count + (mid - i);
//            }
//        }
//
//        /* Copy the remaining elements of left subarray
//       (if there are any) to temp*/
//        while (i <= mid - 1)
//            temp[k++] = arr[i++];
//
//        /* Copy the remaining elements of right subarray
//       (if there are any) to temp*/
//        while (j <= right)
//            temp[k++] = arr[j++];
//
//        /*Copy back the merged elements to original array*/
//        for (i = left; i <= right; i++)
//            arr[i] = temp[i];
//
//        return inv_count;
//    }
//
//    // Driver method to test the above function
//    public static void main(String[] args)
//    {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
////        int arr[] = new int[] { 1, 20, 6, 4, 5 };
//        System.out.println( mergeSort(arr, 5));
//    }
//}
//

import java.util.Arrays;
import java.util.Scanner;

class inversions {
    // Merge two sorted subarrays arr[low .. mid] and arr[mid + 1 .. high]
    public static int merge(int[] arr, int[] aux, int low, int mid, int high) {
        int k = low, i = low, j = mid + 1;
        int inversionCount = 0;

        // While there are elements in the left and right runs
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                aux[k++] = arr[i++];
            } else {
                aux[k++] = arr[j++];
                inversionCount += (mid - i + 1);    // NOTE
            }
        }

        // Copy remaining elements
        while (i <= mid)
            aux[k++] = arr[i++];

        // Don't need to copy second half

        // copy back to the original array to reflect sorted order
        for (i = low; i <= high; i++) {
            arr[i] = aux[i];
        }

        return inversionCount;
    }

    // Sort array arr [low..high] using auxiliary array aux[]
    public static int mergeSort(int[] arr, int[] aux, int low, int high) {
        // Base case
        if (high == low) {    // if run size == 1
            return 0;
        }

        // find mid point
        int mid = (low + ((high - low) >> 1));
        int inversionCount = 0;

        // recursively split runs into two halves until run size == 1,
        // then merge them and return back up the call chain

        inversionCount += mergeSort(arr, aux, low, mid);        // split / merge left half
        inversionCount += mergeSort(arr, aux, mid + 1, high); // split / merge right half
        inversionCount += merge(arr, aux, low, mid, high);    // merge the two half runs

        return inversionCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
//        int[] arr = { 1, 9, 6, 4, 5 };
        int[] aux = Arrays.copyOf(arr, arr.length);

        // get inversion count by performing merge sort on arr
        System.out.println(mergeSort(arr, aux, 0, arr.length - 1));
    }
}