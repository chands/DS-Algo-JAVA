import java.util.*;
  public class DecimalToAnyBase{
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
      scn.close();
   }
  
   public static int getValueInBase(int n, int b){
       // Convert Decimal to any base no.
    //    int pos =0;
    //    int cn = 0;
    //    while(n!=0){
    //        int r = n%b;
    //        int posval = r*(int)Math.pow(10, pos);
    //        n = n/b;
    //        pos++;
    //        cn = cn + posval;
    //    }
    //    return cn;
    int rv = 0;
    int p = 1;
    while(n>0){
        int dig = n%b;
        n = n/b;
       rv += dig*p;
       p = p*10; 
    }
    return rv;
   }
  }