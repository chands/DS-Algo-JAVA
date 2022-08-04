import java.io.*;
import java.util.*;

public class ReverseanArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a){
   
    int[] b = new int[a.length];
    for(int i = 0; i<a.length; i++){
        b[i] = a[a.length-1-i];
    }
    for(int i = 0; i<a.length; i++){
        a[i] = b[i];
    }
        // int i = 0;
        // int j = a.length - 1;
        // int buf;
        // while (i <= j) {
        //     int swap = 0;
        //     swap = a[i];
        //     a[i] = a[j];
        //     a[j] = swap;
        //     i++;
        //     j--;
        // }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    reverse(a);
    display(a);
 }

}