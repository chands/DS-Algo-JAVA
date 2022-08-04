import java.util.*;
  
  public class PythagoreanTriplet{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int a = scn.nextInt();
      int b = scn.nextInt();
      int c = scn.nextInt();
      //check max
      int max = a;
      if(b>max){
          max = b;
      }
      if(c>max){
          max=c;
      }
      if(max==a){
          boolean flag =(a*a==(b*b + c*c));
          System.out.println(flag);
      }
      else if(max==b) {
        boolean flag =(b*b==(a*a + c*c));
        System.out.println(flag);
      }
      else{
        boolean flag =(c*c==(b*b + a*a));
        System.out.println(flag);
      }
    //Alternate
    //   if(a*a==(b*b + c*c) || b*b==(a*a + c*c) || c*c==(b*b + a*a)){
    //       System.out.println("true");
    //   }
    //   else{
    //       System.out.println("false");
    //   }
      scn.close();
   }
  }