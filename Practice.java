import java.util.*;

public class Practice {
    public static void main(String[] args) {
        System.out.println(countSetBits(17));
    }
    
    public static int countSetBits(int n){
        if (n <= 1)
            return n;
        int x = findLargestPower(n);
        return (x * (int)Math.pow(2, (x - 1))) + (n - (int)Math.pow(2, x) + 1)
        + countSetBits(n - (int)Math.pow(2, x));
    }

    public static int findLargestPower(int n){
        int x = 0;
        while ((1 << x) <= n)
            x++;
        return x - 1;
    }
}
