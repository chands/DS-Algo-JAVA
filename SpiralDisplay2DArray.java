import java.io.*;
import java.util.*;

public class SpiralDisplay2DArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        int rmin = 0;
        int cmin = 0;
        int rmax = a.length - 1;
        int cmax = a[0].length - 1;

        int count = 0;
        while (count < n * m) {
            for (int i = rmin, j = cmin; i <= rmax && count < n * m; i++) {
                System.out.println(a[i][j]);
                count++;
            }
            cmin++;

            for (int i = rmax, j = cmin; j <= cmax && count < n * m; j++) {
                System.out.println(a[i][j]);
                count++;
            }
            rmax--;

            for (int i = rmax, j = cmax; i >= rmin && count < n * m; i--) {
                System.out.println(a[i][j]);
                count++;
            }
            cmax--;

            for (int i = rmin, j = cmax; j >= cmin && count < n * m; j--) {
                System.out.println(a[i][j]);
                count++;
            }
            rmin++;
        }
    }

}