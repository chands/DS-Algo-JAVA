import java.util.*;

public class InverseIndex{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int count=0;
    int inverse = 0;
    //corrosponding ith index from right i will be placed at the rth position.
    while(n!=0){
        int r = n%10;
        count++;
        n = n/10;
        int y = count*(int)Math.pow(10, r-1); 
        inverse = inverse + y;
    }
    System.out.println(inverse);
    scn.close();
 }
}