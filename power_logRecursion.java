import java.io.*;
import java.util.*;

public class power_logRecursion {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int y = power(x, n);
        System.out.println(y);
        scn.close();
    }
    // Power-logarithmic: theta(logn),stack space height|Auxiliary space: log(n); x^n = x^n/2*x^n/2;
    public static int power(int x, int n) {
        if(n==0){
            return 1;
        }
        int y = power(x,n/2);
        int z=y*y;
        if(n % 2==1){
            z = z*x;
        }
        return z;
    }
    //Iterative power: time complexity: O(logn) & Auxiliary space: O(1);
    //idea behind: every no. can be written as sum of powers of 2(set bits in binary representation)
    //we can traverse from LSB to MSB(in O(logn) time) to all bits of the exponent number ignore if zero remainder.
    // public static void power(int x, int n) {
    //     int res = 1;
    //     while(n > 0){ //3^10 = 3^8 + 3^2; i.e, 10 = 1010;
    //         
    //         if(n % 2 != 0){
    //             res = res*x;
    //         }
    //         x = x*x;
    //         n = n/2;
    //     }
    //     System.out.println(res);
    // }
}