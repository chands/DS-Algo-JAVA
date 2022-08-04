import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int tab = 1;
        int st = (n/2) + 1;
        for(int i = 1; i<=n; i++){
        //   System.out.println(st+"," + tab +"," +st);
        for(int j = 1; j<=st; j++){
            System.out.print("*\t");
        }
        for(int j = 1; j<=tab; j++){
            System.out.print("\t");
        }
        for(int j = 1; j<=st; j++){
            System.out.print("*\t");
        }
         if(i<=n/2){
            tab+=2;
            st--;
         }
         else{
            tab-=2;
            st++;
         }
         System.out.println();
        }
        scn.close();
    }
}