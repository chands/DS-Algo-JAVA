import java.io.*;
import java.util.*;

public class CeilandFloorofanArrayElement {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<a.length; i++){
            a[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int l = 0;
        int h = a.length-1;
        //Aletrnative
        // int ceil = 0;
        // int floor = 0;
        // while(l<=h){
        //     int m = (l + h)/2;
        //     if(d<a[m]){
        //         h = m-1;
        //         ceil = a[m];
        //     } else if(d>a[m]){
        //         l = m+1;
        //         floor = a[m];
        //     } else{
        //         ceil = a[m];
        //         floor = a[m];
        //         break;
        //     }
        // }
        // System.out.println(ceil);
        // System.out.println(floor);

        while(l<=h){
            int m = (l+h)/2;
            if(d>a[m]){
                l = m+1;
                if(d<a[m+1]){
                    System.out.println(a[m+1]);
                    System.out.println(a[m]);
                    return;
                }
            } else if(d<a[m]){
                h = m-1;
                if(d>a[m-1]){
                    System.out.println(a[m]);
                    System.out.println(a[m-1]);
                    return;
                }
            } else{
                System.out.println(a[m]);
                return;
            }
        }
        scn.close();
    }
}