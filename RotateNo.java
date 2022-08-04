import java.util.*;
   
   public class RotateNo{
   
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int d = (int)Math.log10(n);
     //no. of digit = d+1;
     int fact = (int)Math.pow(10, d);
     int k = scn.nextInt();
     k = k%(d+1);
    int j= Math.abs(k);
     for(int i=1;i<=j;i++){
         if(k>0){
             int r = n%10;
             int x = n/10;
             n = x + r*fact;
         }
         else{
             int q = n/fact;
             n = n%fact;
             n = n*10 + q;
            }
        }
     System.out.println(n);
     scn.close();
    }
   }