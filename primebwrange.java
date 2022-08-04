import java.util.*;

public class primebwrange{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for(int i = low; i <= high; i++){
            int isprime = 0;
            for(int j=2; j*j<=i; j++){
                if(i%j==0)
                {
                    isprime = isprime + 1;
                    break;
                }
            }
            if(isprime==0){
                System.out.println(i);
            }
        }
        scn.close();
    }
}