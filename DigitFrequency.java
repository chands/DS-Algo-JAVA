import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
        int count = 0;
        while(n>0){
            int j = n%10;
            n = n/10;
            if(j==d){
                count++;
            }
        }
        return count;
        // using no. of digits in a number method
        // int count = 0;
        // int nod = (int)Math.log10(n) + 1;
        // for(int i = 1; i<=nod; i++){
        //     int j = n%10;
        //     n = n/10;
        //     if(j==d){
        //         count++;
        //     }
        // }
        // return count;
    }
}