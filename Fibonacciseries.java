import java.util.*;
public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      System.out.print("Enter a number:");
      int n = scn.nextInt();
      if(n<1||n>=40)
         System.out.println("Enter Number in the range of [1,40)");
      else
      {
      // int pre=0, nxt=0,n1,i;
      // for(i=1;i<=n;i++){
      //     if(i<=2){
      //          n1=i-1;
      //     }
      //     else{
      //          n1=pre+nxt;
      //       }
      // pre=nxt;
      // nxt=n1;
      // System.out.println(n1);
      //   }
      //Alternate.1
      int pre=0, nxt=1,n1,i;
      for(i=0;i<n;i++){
        System.out.println(pre);
               n1=pre+nxt;
      pre=nxt;
      nxt=n1;
        }
      }
      scn.close();
    }
 }