import java.util.*;
public class Exactly3Divisors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        for(int i = 2; i*i <= n; i++){
            if(isPrime(i))
                count++;
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0)
               return false;
        }
        return true;
    }
}
