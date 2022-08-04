import java.io.*;
import java.util.*;

public class Differenceofteoarray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int[] dif = new int[n2];
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = dif.length - 1;

        int b = 0;
        int a1val;
        while (k >= 0) {
            if (i >= 0) {
                a1val = a1[i];
            } else {
                a1val = 0;
            }
            //int a1val = i>=0? a1[i]: 0; //using ternary operator.

            if (a2[j] + b < a1val) {
                dif[k] = a2[j] + b + 10 - a1val;
                b = -1;
            } else {
                dif[k] = a2[j] + b - a1val;
                b = 0;
            }

            i--;
            j--;
            k--;
        }
        int d = 0;
        for(k = 0; k<dif.length; k++){
            if(dif[k]>0){
                d = k;
                break;
            }
        }
        for(k =d; k<dif.length; k++){
            System.out.println(dif[k]);
        }
        scn.close();
    }

}