import java.util.*;
public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int n1 = 0;
        int n2 = 1;
        int n3;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(n1 +"\t");
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                
            }
        System.out.println();
        }
        scn.close();
    }
}