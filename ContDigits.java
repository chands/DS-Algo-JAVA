import java.util.*;
  public class ContDigits{
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int d;
    //   for(int i = 1;i<10;i++){
    //       d++;
    //       n=n/10;
    //       if(n==0){
    //           break;
    //       }
    //   }
    // while(n!=0){
    //     d++;
    //     n=n/10;
    //     if(n==0){
    //         break;
    //     }
    // }
    //   System.out.print(d);
    //   scn.close();
    d=(int)Math.log10(n);
    System.out.println(d+1);
    scn.close();
   }
  }