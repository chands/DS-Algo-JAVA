import java.util.*;
public class AnyBaseSubtraction {
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
      scn.close();
   }
  
   public static int getDifference(int b, int n1, int n2){
    int rv = 0;
    int bor = 0;
    int p = 1;
    while(n2>0){
        int d1 = n1%10;
        int d2 = n2%10;
        n1 = n1/10;
        n2 = n2/10;
        int dif = 0;
        d2 = d2 + bor;
        if(d2>=d1){
            bor =0;
            dif = d2-d1;
        } else{
            bor = -1;
            dif = d2+b-d1;
        }
        rv = rv + dif * p;
        p*=10;
    }
    return rv;
       
   }
}