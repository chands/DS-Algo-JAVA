import java.io.*;
import java.util.*;

public class FactorialRecursion {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
        digitInFactorial(n);
        scn.close();
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int y = n*factorial(n-1);
        return y;
    }

    //Calculate number of digits in result of N! without calculating factorial;
    public static void digitInFactorial(int n) {
        //no of digit in number "M" = N! will be (log10M + 1);
        double total = 0;
        for(int i = 1; i <= n; i++){
            total += Math.log10(i);
        }
        System.out.println((int)Math.floor(total) + 1);
    }
}
