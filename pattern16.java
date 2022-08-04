import java.util.*;
public class pattern16 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 2*n - 3;
        int st = 1;

        for(int i = 1; i <= n; i++){
            int val = 1;
            for(int j = 1; j<=st; j++){
                System.out.print(val+"\t");
                val++;
            }
            for(int j = 1; j<= sp; j++){
                System.out.print("\t");
            }
            if(i==n){
                st--;
                val--;
            }
            for(int j = 1; j<=st; j++){
                val--;
                System.out.print(val+"\t");
            }
            st++;
            sp-=2;
            System.out.println();
        }

        //Alternative method:
        // int tab = 2*n - 3;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j+"\t");
        //     }
        //     for(int j = 1; j <= tab; j++){
        //         System.out.print("\t");
        //     }
        //     if(i==n){
        //      for(int j = i-1; j >= 1; j--){
        //            System.out.print(j+"\t");
        //         }
        //     }
        //     else{
        //         for(int j = i; j >= 1; j--){
        //            System.out.print(j+"\t");
        //         }
        //     }
        //     System.out.println();
        //     tab -= 2;
        // }
        scn.close();
    }
}