import java.io.*;
import java.util.*;

public class MaxOfArrayRecursion {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        System.out.println(maxOfArray(a, 0));

    }

    public static int maxOfArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return 0;
        }
        int max = arr[idx];
        int max1 = maxOfArray(arr, idx + 1);
        if (max < max1) {
            max = max1;
        }
        return max;
        //Alternate: More reliable method then above
        // if (idx == arr.length - 1) {
        //     return arr[idx];
        // }
        // int misa = maxOfArray(arr, idx + 1);
        // if (arr[idx] < misa) {
        //     return misa;
        // } else {
        //     return arr[idx];
        // }
    }

}