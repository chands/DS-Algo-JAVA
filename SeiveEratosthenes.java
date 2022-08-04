import java.util.*;
//to fnd all prime numbers upto a given no "n";
public class SeiveEratosthenes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        seiveEratosthenes(n);
    }

    public static void seiveEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        //Basic approach: complexity - n*log(log(n)).
        // for(int i = 2; i*i <= n; i++){
        //     if(isPrime[i]){
                   //Replaced 2*i by i*i (more optimised version).
        //         for(int j = i*i; j <= n; j += i){
        //             isPrime[j] = false;
        //         }
        //     }
            
        // }
        // for(int i = 2; i <= n; i++){
        //     if(isPrime[i]){
        //         System.out.print(i + " ");
        //     }
        // }

        //Shorter implementation of above optimised Seive:
        for(int i = 2; i <= n; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
                for(int j = i*i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
    }
}