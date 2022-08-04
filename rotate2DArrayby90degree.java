import java.io.*;
import java.util.*;

public class rotate2DArrayby90degree {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        //Transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = 0;
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        
        //Reverse the columns
        int count = 0;
        while (count < n / 2) {
            for (int i = 0; i < n; i++) {
                int temp = 0;
                temp = a[i][count];
                a[i][count] = a[i][n - 1 - count];
                a[i][n - 1 - count] = temp;
            }
            count++;
        }
        
        display(a);
        scn.close();
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}