import java.io.*;
import java.util.*;

public class SearchinSorted2DArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        int x = scn.nextInt();

        int i = 0;
        int j = a[0].length - 1;
        while (i < a.length && j >= 0) {
            if (x == a[i][j]) {
                System.out.println(i);
                System.out.println(j);
                return;
            } else if (x > a[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("Not Found");

        //Alternate
        // boolean flag = false;
        // int r = 0;
        // int c = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (a[i][j] == x) {
        //             flag = true;
        //             r = i;
        //             c = j;
        //         }
        //     }
        // }
        // if (flag == true) {
        //     System.out.println(r);
        //     System.out.println(c);
        // } else {
        //     System.out.println("Not Found");

        // }
        scn.close();
    }

}