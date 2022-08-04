import java.util.*;
public class DisplayDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = (int)Math.log10(n);
        int x = (int)Math.pow(10, p);
        while(x!=0){
            int d = n/x;
            System.out.println(d);
            n = n%x;
            x=x/10;
        }
        scn.close();
    }
    
}