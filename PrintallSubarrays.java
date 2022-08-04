import java.io.*;
import java.util.*;

public class PrintallSubarrays {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i; j++){
                for(int k = 0; k<=j; k++){
                    System.out.print(a[i+k] + "\t");
                }
                System.out.println();
            }
        }
        scn.close();
    }

}