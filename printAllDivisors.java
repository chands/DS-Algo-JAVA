import java.util.*;
public class printAllDivisors{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //works in sqrt(n) complexity but not sorted.

        // for(int i = 1; i*i <= n; i++){
        //     if(n % i == 0){
        //         System.out.print(i + " ");
        //         if(i != n/i)
        //             System.out.print(n/i + " ");
        //     }
        // }

        // sorted and same complexity as above :D.
        int i;
        for(i = 1; i*i < n; i++){ // from [1, sqrt(n))
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        for(; i*i >= 1; i--){ // from [sqrt(n), n]
            if(n % i == 0){
                System.out.print(n/i + " ");
            }
        }
        scn.close();
    }
}