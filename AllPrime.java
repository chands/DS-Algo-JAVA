import java.util.*;
public class AllPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        allPrime(n);
    }
    public static void allPrime(int n) {
        //Basic approach: n*sqrt(n)
        for(int i = 2; i <= n; i++){
            if(isPrime(i))
              System.out.print(i + " ");
        }
    }
    public static boolean isPrime(int n) {
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0)
               return false;
        }
        return true;
    }
}
