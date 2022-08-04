import java.io.*;
import java.util.*;

public class firstIndexRecursion {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        System.out.println(firstIndex(a, 0, x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        // best case for first index do comparison before recursion call
        // while best case for last index: do comparison after recursive call
        if(arr[idx]==x){
            return idx;
        } else{
            return firstIndex(arr, idx+1, x);
        }
    }

}