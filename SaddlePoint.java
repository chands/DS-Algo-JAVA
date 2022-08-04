import java.io.*;
import java.util.*;

public class SaddlePoint {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            int col = 0;
            for (int j = 1; j < n; j++) {
                if (a[i][col] > a[i][j]) {
                    col = j;
                }
            }
            boolean flag = true;
            for (int k = 0; k < n; k++) {
                if (a[i][col] < a[k][col]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(a[i][col]);
                return;
            }
        }
        System.out.println("Invalid input");
    }

}