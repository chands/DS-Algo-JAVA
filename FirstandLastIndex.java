import java.io.*;
import java.util.*;
public class FirstandLastIndex {
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
        int fi = -1;
        while(l<=h){
            int m = (l+h)/2;
            if(d>a[m]){
                l = m+1;
            } else if(d<a[m]){
                h = m-1;
            } else{
                fi = m;
                h = m-1;
            }
        }
        System.out.println(fi);

        l = 0;
        h = a.length-1;
        int li = -1;
        while(l<=h){
            int m = (l+h)/2;
            if(d>a[m]){
                l = m+1;
            } else if(d<a[m]){
                h = m-1;
            } else{
                li = m;
                l = m+1;
            }
        }
        System.out.println(li);
        scn.close();
    }
}