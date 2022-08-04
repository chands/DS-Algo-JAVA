import java.util.*;

public class pattern10{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int otab = n/2;
    int intab = -1;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=otab; j++){
            System.out.print("\t");
        }
        System.out.print("*\t");
        for(int j=1; j<=intab; j++){
            System.out.print("\t");
        }
        if(i>1 && i<n){
            System.out.print("*\t");
        }
        if(i<=n/2){
            otab--;
            intab+=2;
        }
        else{
            otab++;
            intab-=2;
        }
        System.out.println();
    }
    scn.close();
 }
}