import java.io.*;
import java.util.*;
public class RotateShellof2DArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(); //Row
        int m = scn.nextInt(); //Column
        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt(); //Shell no.
        int r = scn.nextInt(); //No. of rotation

        RotateShell(a, s, r);
        display(a);
        scn.close();
    }

    public static void RotateShell(int[][] arr, int s, int r) {
        int [] OneD = FillOneDFromShell(arr, s);
        rotate(OneD, r);
        FillShellFromOneD(arr, s, OneD);
    }

    public static void rotate(int[] OneD, int r) {
        r = r%OneD.length;
        if(r<0){
            r = r + OneD.length;
        }
        Reverse(OneD, 0, OneD.length-r-1);
        Reverse(OneD, OneD.length-r, OneD.length-1);
        Reverse(OneD, 0, OneD.length-1);
    }

    public static void Reverse(int[] OneD, int li, int ri) {
        while(li<ri){
            int temp = OneD[li];
            OneD[li] = OneD[ri];
            OneD[ri] = temp;
            li++;
            ri--;
        }
    }

    public static int[] FillOneDFromShell(int[][] arr, int s) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        int sz = 2*(maxr - minr + maxc - minc);
        int[] OneD = new int[sz];
        //LW
        int idx = 0;
        for(int i = minr, j = minc; i<=maxr; i++){
            OneD[idx] = arr[i][j];
            idx++;
        }
        //BW
        for(int i = maxr, j = minc + 1; j<=maxc; j++){
            OneD[idx] = arr[i][j];
            idx++;
        }
        //RW
        for(int i = maxr - 1, j = maxc; i>=minr; i--){
            OneD[idx] = arr[i][j];
            idx++;
        }
        //TW
        for(int i = minr, j = maxc-1; i>=minc + 1; j--){
            OneD[idx] = arr[i][j];
            idx++;
        }
        return OneD;
    }

    public static void FillShellFromOneD(int[][] arr, int s, int[] OneD) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        
        //LW
        int idx = 0;
        for(int i = minr, j = minc; i<=maxr; i++){
            arr[i][j] = OneD[idx];
            idx++;
        }
        //BW
        for(int i = maxr, j = minc + 1; j<=maxc; j++){
            arr[i][j] = OneD[idx];
            idx++;
        }
        //RW
        for(int i = maxr - 1, j = maxc; i>=minr; i--){
            arr[i][j] = OneD[idx];
            idx++;
        }
        //TW
        for(int i = minr, j = maxc-1; i>=minc + 1; j--){
            arr[i][j] = OneD[idx];
            idx++;
        }
    }

    // My Alternative approach :)
    // public static void RotateShell(int[][] a, int s, int r) {
    //     int n = a.length;
    //     int m = a[0].length;
    //     int row = n - 2 * (s - 1);
    //     int col = m - 2 * (s - 1);
    //     int N = 2 * (row + col - 2);
    //     r = r % N;
    //     if (r < 0) {
    //         r = r + N;
    //     }
    //     for (int k = 1; k <= r; k++) {
    //             //Top line
    //             for (int i = s - 1, j = s - 1; j < m - s; j++) {
    //                 int p = i;
    //                 int q = j + 1;
    //                 swap(a, i, j, p, q);
    //             }
    //             //Right line
    //             for (int i = s - 1, j = m - s; i < n - s; i++) {
    //                 int p = i + 1;
    //                 int q = j;
    //                 swap(a, i, j, p, q);
    //             }
    //             //Bottom line
    //             for (int i = n - s, j = m - s; j >= s; j--) {
    //                 int p = i;
    //                 int q = j - 1;
    //                 swap(a, i, j, p, q);
    //             }
    //             //Left line
    //             for (int i = n - s, j = s - 1; i > s; i--) {
    //                 int p = i - 1;
    //                 int q = j;
    //                 swap(a, i, j, p, q);
    //             }
    //     }
    // }

    // public static void swap(int[][] arr, int i, int j, int p, int q) {
    //     int temp = arr[i][j];
    //     arr[i][j] = arr[p][q];
    //     arr[p][q] = temp;
    // }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}