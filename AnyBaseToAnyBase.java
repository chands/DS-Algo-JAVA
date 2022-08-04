import java.util.*;

public class AnyBaseToAnyBase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int d = getValueInAnyBase(n, sourceBase, destBase);
        System.out.println(d);
        scn.close();
    }
    public static int getValueInAnyBase(int n, int sourceBase, int destBase) {
        
        int iv = anybasetodecimal(n, sourceBase);
        int fv = decimaltoanybase(iv, destBase);
        return fv;
    }

    public static int anybasetodecimal(int n, int sourceBase) {
        int rv = 0;
        int p = 1;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            rv += digit * p;
            p *= sourceBase;
        }
        return rv;
    }
    
    public static int decimaltoanybase(int iv, int destBase){
       
    int rv = 0;
    int p = 1;
    while(iv>0){
        int dig = iv%destBase;
        iv = iv/destBase;
       rv += dig*p;
       p = p*10; 
    }
    return rv;
    }
}