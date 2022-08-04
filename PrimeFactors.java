import java.util.*;
public class PrimeFactors{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
            for (int i=2; i*i<=n; i++){
                while(n%i==0){
                n = n/i;
                System.out.print(i+" ");
                }
            }
            if(n!=1){
                System.out.print(n);
            }
        
        scn.close();
    }
    //Alternative & more optimised way O(sqrt(n)).
    // public static void printPrimeFactor(int n) {
    //     if(n < 1) return;
    //     while(n % 2 == 0){
    //         System.out.print(2);
    //         n = n/2;
    //     }
    //     while(n % 3 == 0){
    //         System.out.print(3);
    //         n = n/3;
    //     }
    //     for(int i = 5; i*i <= n; i += 6){
    //         while(n % i == 0){
    //             System.out.print(i);
    //             n = n/i;
    //         }
    //         while(n % (i + 2) == 0){
    //             System.out.print(i + 2);
    //             n = n/(i + 2);
    //         }
    //     }
    //     if(n > 3){
    //         System.out.print(n);
    //     }
    // }
       
}