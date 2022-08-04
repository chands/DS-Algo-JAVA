import java.io.*;
import java.util.*;

public class RotateanArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val: a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }
    
    // public static void reverse(int[] a, int i, int j) {
    //     int li = i;
    //     int ri = j;
    //     while(li<=ri){
    //         int temp = a[li];
    //         a[li] = a[ri];
    //         a[ri] = temp;
    //         li++;
    //         ri--;
    //     }
    // }
    // public static void rotate(int[] a, int k) {
    //     k = k % a.length;
    //     if (k<0){
    //         k = k + a.length;
    //     //part1
    //     reverse(a, 0, a.length-k-1);
    //     //part2
    //     reverse(a, a.length-k-1, a.length-1);
    //     //all
    //     reverse(a, 0, a.length-1);
    // }
    //Alternate
    public static void rotate(int[] a, int k) {
        
        k = k % a.length;
        int r = Math.abs(k);
        for (int i = 1; i <= r; i++) {
            if (k > 0) {
                int temp = a[a.length-1];
                for (int j = a.length - 1; j >= 1; j--) {
                    a[j] = a[j-1];
                }
                a[0] = temp;
            } else{
                int temp = a[0];
                for (int j = 0; j <= a.length-2; j++) {
                    a[j] = a[j+1];
                }
                a[a.length-1] = temp;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}