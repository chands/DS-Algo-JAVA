import java.util.*;

public class AnyBaseMultiplication {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getProduct(int b, int n1, int n2) {
        int rv = 0;
        int p = 1;
        while(n2>0){
            int d2 = n2%10;
            n2 = n2/10;
            int sprod = getProductwithsingledigit(b, n1, d2);
            rv = getSum(b, rv, sprod*p);
            p = p*10;
        }

        return rv;
    }

    public static int getProductwithsingledigit(int b, int n1, int d2) {
        int rv = 0;
        int c = 0;
        int p =1;
        while(n1>0 || c>0){
            int d1 = n1%10;
            n1 = n1/10;
            int d = d1*d2 + c;
            c = d/b;
            d = d%b;
            rv += d*p;
            p *=10; 
        }
        return rv;
    }

    public static int getSum(int b, int n1, int n2){
        int rv = 0;
        int c = 0;
        int p = 1;
        while(n1>0 || n2>0 || c>0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1 = n1/10;
            n2 = n2/10;
            int d = d1 + d2 + c;
            c = d/b;
            int digit = d%b;
            rv += digit*p;
            p = p*10;
        }
        return rv;
    }

    // public static int getProduct(int b, int n1, int n2) {

    //     int num1 = anybasetodecimal(n1, b);
    //     int num2 = anybasetodecimal(n2, b);
    //     int net = num1 * num2;
    //     int rv = decimaltoanybase(net, b);
    //     return rv;
    // }

    // public static int anybasetodecimal(int n, int b) {
    //     int rv = 0;
    //     int p = 1;
    //     while (n != 0) {
    //         int digit = n % 10;
    //         n = n / 10;
    //         rv += digit * p;
    //         p *= b;
    //     }
    //     return rv;
    // }

    // public static int decimaltoanybase(int n, int b) {
    //     int rv = 0;
    //     int p = 1;
    //     while (n != 0) {
    //         int digit = n % b;
    //         n = n / b;
    //         rv += digit * p;
    //         p *= 10;
    //     }
    //     return rv;
    // }
}