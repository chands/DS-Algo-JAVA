import java.util.*;
public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int count=0;
        // for(int i=1; i<=n; i++){
        //     if(n%i==0){
        //         count++;
        //     }
        //     while(count%2!=0){
        //         System.out.println(i);
        //     }
        // }
      for(int i=1;i*i<=n;i++){
          System.out.println(i*i);
      }
        scn.close();
    }
}