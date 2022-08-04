import java.util.*;

public class bitwiseOperation {
    // Driver code
    public static void main(String[] args) {
        String str = "abc";
        printPowerSet(str);
    }

    //Q: Kth bit from right of a no. in binary representation is set or not?
    public static boolean checkKthBit(int n, int k) {
        // if((1 & (n >> (k-1))) != 0)//using right shift operator:
        //     return true;
        // return false;

        if((n & (1 << (k-1))) != 0) //using left shift operator:
           return true;
        return false;
    }

    //Q: count total no of set bits in a number n.
    public static int setBitCounts(int n) {
        int count = 0;
        // while(n > 0){ //1st Method: Theta(total no of bits in n)
        //     if((n & 1) != 0) count++;
        //     n = n >> 1;
        // }
        while(n > 0) { //2nd Method:Brian Kernighan's Algorithm: Theta(total no of set bits in n)*****
            n = (n & (n-1));//process to Unset the last Set bit.
            count++;
        }
        return count;
    }

    //3rd Method: Lookup table method: count total no of set bits in "n";
    static int[] arr = new int[256];
    static int[] initialise(){
        arr[0] = 0;//store, no of set bits in Number 1 to 256, in an Array;
        for(int i = 1; i < 256; i++){
            arr[i] = (i & 1) + arr[i/2];//**8 bit LookUp array/table.
        }
        return arr;
    }
    public static int countsetbits(int n) {
        initialise();
        int result = 0;
        result = arr[n & 0xff];//use & repeat 8 bit lookup array/table.
        n = n >> 8;
        result = result + arr[n & 0xff];
        n = n >> 8;
        result = result + arr[n & 0xff];
        n = n >> 8;
        result = result + arr[n & 0xff];
        return result;
    }

    //Q: given number is power of 2 or not?
    public static boolean isPow2(int n) {
        // double m = (Math.log(n))/(Math.log(2));
        // if(m == (int)m){ //if log2(n) is integer value then n is power of 2;
        //     return true;
        // }
        // return false;

        //M2:There is only one Set bit in in 2's power;
        if(n == 0) return false;
        return ((n & (n-1)) == 0); //Unset the Set bit(using Brian Karnighan's Algo);
    }

    //Q: find the odd occuring no in an array.
    public static int oddOccuringNO(int[] arr) {
        //Naive solution: O(n^2)
        // int count = 0;
        //  for(int i = 0; i < arr.length; i++){
        //     for(int j = 0; j < arr.length; j++){
        //         if(arr[j] == arr[i])
        //            count++;
        //     }
        //     if(count%2 != 0)
        //        return arr[i];
        //  }
        // return count;

        //Optimised solution: XOR operation: O(n), aux space: O(1);
        //properties used: x^0 = x; x^x = 0; x^y = y^x; x^(y^z) = (x^y)^z;
        int res = 0;
         for(int i = 0; i < arr.length; i++){
             res = res^arr[i];
         }
        return res;
        //variation question:
        //given an array of len n, having values in range [1, n+1], every no appears exactly once.
        //so find the missing no. from the array.
        //Solution: find XOR of whole array then calculate XOR of the result with numbers 1 to n+1;
    }

    //Q: find the only two odd occuring no in an array:
    public static void twoOddAppearing(int[] arr) {//theta(n)
        int n = arr.length;
        int xor = 0;
        int res1 = 0;
        int res2 = 0;
        for(int i = 0; i < n; i++){
            xor = xor^arr[i]; //This will give XOR of only two odd appearing numbers.
        }
        //***Since XOR of "0" & "1" Is "1"(Set bit); so we need to find the rightmost Set bit, which will be
        //present in one odd appearing Number but not in another. Based on such criteria we can divide the 
        //whole array into two different arrays each containg one odd appearing numbers. Hence now we can 
        //simply XOR the whole two new arrays to get the bot odd appearing numbers.
        int sn = xor & ~(xor - 1);//***gives only the Rightmost set bit same as origional "xor" result.
        for(int i = 0; i < n; i++){
            if((arr[i]&sn) != 0)
                res1 = res1^arr[i]; //XOR of 1st array which doesn't have rightmost set bit as "xor";
            else
                res2 = res2^arr[i];//XOR of 2nd array which have rightmost set bit as origional "xor";
        }
        System.out.println(res1 + ", " + res2);
    }

    //Q: Power set using bitwise operator: n char string will have total 2^n power set.
    public static void printPowerSet(String str) {//theta(n*2^n)
        int n = str.length();
        int PowSize = (int)Math.pow(2, n);
        for(int counter = 0; counter < PowSize; counter++){
            for(int j = 0; j < n; j++){
                if((counter & (1<<j)) != 0)
                   System.out.print(str.charAt(j));
            }
            System.out.println("\n");
        }
    }
    
    //Q: to find the position of rightmost different bit in the 'm' and 'n'.
    static int posOfRightmostDiffBit(int m, int n) {
        // if(m==n) {//returns void if commented code is being used.
        //     System.out.println("-1");
        // }
        // else {
        //     int x = m^n;
        //     int res = x & ~(x-1);
        //     int count = 0;
        //     while(true){
        //         if((res & (1<<count)) == 0){
        //            count++;
        //         }
        //         if((res & (1<<count)) != 0) {
        //            System.out.println(count + 1);
        //            break;
        //         }
        //     }
        // }

        //method 2:
        return getRightmostSetBit(m^n);
    }

    // Function to find the position of rightmost set bit in 'n'
    // return -1 if there is no set bit.
    static int getRightmostSetBit(int n) {
        if(n == 0) return -1;
        return (int)((Math.log10(n & -n)) /
        Math.log10(2)) + 1;
    }

    //Q: Count total set bits in all numbers from 1 to n: using recursion
    public static int countSetBits(int n){//time: Theta(logn)
        if (n <= 1)
            return n;
        int x = findLargestPower(n);
        return (x * (int)Math.pow(2, (x - 1))) + (n - (int)Math.pow(2, x) + 1)
         + countSetBits(n - (int)Math.pow(2, x));
    }

    //count(x) = x*pow(2,(x-1)), here x is position of set bit of the largest power of 2 till n.
    public static int findLargestPower(int n){
        int x = 0;
        while ((1 << x) <= n)
            x++;
        return x - 1;
    }
}