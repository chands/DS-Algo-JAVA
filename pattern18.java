import java.util.*;
public class pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = n;
        int tab = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= tab; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++){
                if(i <= n/2 && i>1 && j>1 && j <st){
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }
            }
            if(i<=n/2){
                tab++;
                st-=2;
            }
            else{
                tab--;
                st+=2;
            }
            System.out.println();
        }
        scn.close();
    }
}