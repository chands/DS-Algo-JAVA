import java.util.*;

public class LCMandGCD {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int n1 = num1;
        int n2 = num2;
        int r = n1;
        while (r != 0) {
            r = n2 % n1;
            n2 = n1;
            n1 = r;
        }
        System.out.println(n2);
        System.out.println(num1 * num2 / n2);
        scn.close();
    }
    //Alternate approach : Euclidean Algorithm:
    //let 'b' be smaller than 'a'; GCD(a, b) = GCD((a - b), b);
    //How? let 'g' be GCD of 'a' & 'b' => a = g*x & b = g*y & GCD(x, y) = 1;
    //(a - b) = g*(x-y);
    // using Recursion:
    // public static int GCD(int a, int b){
    //     if(b == 0)
    //       return a;
    //     else
    //       return GCD(b, a%b);
    // }

}