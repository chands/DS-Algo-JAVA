import java.io.*;
import java.util.*;

public class SumoftwoArray{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();
    int[] arr1 = new int[n1];
    for(int i = 0; i<n1; i++){
        arr1[i] = scn.nextInt();
    }
    int n2 = scn.nextInt();
    int[] arr2 = new int[n2];
    for(int j = 0; j<n2; j++){
        arr2[j] = scn.nextInt();
    }

    int max =n1;
    if(n2>max){
        max = n2;
    }
    int[] sum = new int[max];
     
    int c = 0;
    for(int k = max-1; k>=0; k--){
        sum[k] = c;
        if(n1-1>=0){
            sum[k] += arr1[n1-1]; 
        }
        if(n2-1>=0){
            sum[k] += arr2[n2-1];
        }
        
            c = sum[k]/10;
            sum[k] = sum[k]%10;
        
        n1--;
        n2--;
    }
    if(c==1){
        System.out.println(c);
    }
    for(int k = 0; k<max; k++){
        System.out.println(sum[k]);
    }
    // Alternative
    // Use of ternary operator to finf max of two no. :)
    // int[] sum = new int[n1 > n2 ? n1 : n2]; 
    //     int c = 0;
    //     int i = arr1.length - 1;
    //     int j = arr2.length - 1;
    //     int k = sum.length - 1;

    //     while (k >= 0) {
    //         int d = c;

    //         if (i >= 0) {
    //             d += arr1[i];
    //         }
    //         if (j >= 0) {
    //             d += arr2[j];
    //         }
    //         c = d / 10;
    //         d = d % 10;
    //         sum[k] = d;
    //         i--;
    //         j--;
    //         k--;
    //     }
        
    //     if (c != 0) {
    //         System.out.println(c);
    //     }
    //     for(int val: sum){
    //         System.out.println(val);
    //     }
    scn.close();
 }

}