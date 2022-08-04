import java.io.*;
import java.util.*;

public class DiagonalTraverseUpper2DArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                a[i][j] = scn.nextInt();
            }
        }

        for(int k = 0; k<=a.length-1; k++){
            for(int i = 0; i<a.length; i++){
                int j = i + k;
                System.out.println(a[i][j]);
            }
        }
        scn.close();
    }

}