import java.io.*;
import java.util.*;

public class SubsetsofanArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        
        for(int i = 0; i<(int)Math.pow(2, a.length); i++){
            int temp = i;
            int[] b = new int[a.length];
            for(int j = a.length-1; j>=0; j--){
                b[j] = temp%2;
                temp = temp/2;
            }
            for(int k = 0; k < a.length; k++){
                // if(a[k] * b[k] == a[k]){
                if(b[k]==1){
                    System.out.print(a[k] + "\t");
                } else{
                    System.out.print("-\t");
                }
            }
            System.out.println();
        }
        scn.close();
    }
}