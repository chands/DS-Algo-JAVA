import java.io.*;
import java.util.*;

public class Demo2DArrays{

public static void main(String[] args) throws Exception {
    //Desi Approach without any knowledge of 2D Array:D
    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // int m = scn.nextInt();

    // int[] ab = new int[n*m];
    // for(int i = 0; i<ab.length; i++){
    //     ab[i] = scn.nextInt();
    // }
    //     int k = 0;
    //     for(int i = 0; i<n; i++){
    //         for(int j = 0; j<m; j++){
    //             System.out.print(ab[k]+" ");
    //             k++;
    //         }
    //         System.out.println();
    //     }

//Alternative and professional method for 2D Arrays:
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] a = new int[n][m];

    for(int i = 0; i<a.length; i++){
        for(int j = 0; j<a[i].length; j++){
            a[i][j] = scn.nextInt();
        }
    }

    for(int i = 0; i<a.length; i++){
        for(int j = 0; j<a[i].length; j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    scn.close();
 }
}