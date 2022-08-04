import java.util.*;

public class pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int tab = n/2;
        int count = 1;
        int m =1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= tab; j++){
                System.out.print("\t");
            }
            int mi = m;
            for(int j = 1; j <= count; j++){
                System.out.print(mi +"\t");
                if(j<=count/2){
                    mi++;
                }
                else{
                    mi--;
                }
            }
            if(i<=n/2){
                tab--;
                count+=2;
                m++;
            }
            else{
                tab++;
                count-=2;
                m--;
            }
            System.out.println();
        }
        scn.close();
    }
}