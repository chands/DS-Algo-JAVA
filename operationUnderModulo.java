import java.util.*;

public class operationUnderModulo { //modulo 10^9+7
    public static void main(String[] args) {
        //System.out.println(additionUnderModulo(11, 11));
        //System.out.println(multiplicationUnderModulo(7, 7));
        System.out.println(modMultiplicativeInverse(10, 17));
    }

    static long additionUnderModulo(long a, long b) {
        long M = 7;
        return (a%M + b%M)%M;
    }

    static long multiplicationUnderModulo(long a, long b) {
        long M = 7;
        return ((a%M)*(b%M))%M;
    }

    //i is modular Multiplicative Inverse of a if (a*i)%M = 1;
    //for i to be smallest MMI of a, x need to exist in [1, M-1];
    static int modMultiplicativeInverse(int a, int M) {
    //The multiplicative inverse of “a modulo m” exists if and 
    //only if a and m are relatively prime (i.e., if gcd(a, m) = 1).
        for(int i = 1; i < M; i++){ //Naive solution
            if((a*i)%M == 1)
               return i;
        }
        return -1;
    }
    
    //Fermat's little theorem: If M is a prime and a is any integer
    //not divisible by M, then a^(M − 1) − 1 is divisible by M.
    //Hence a*x = a^(M-1); => x = a^(M-2) mod M; return x.
    // use Extended Euclidean Algorithm to optimised solution if a and M are Coprime.
}
