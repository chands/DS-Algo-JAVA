import java.util.Scanner;
public class SubsequenceofStrSB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scn.nextLine();

        for(int i = 0; i < (1 << str.length()); i++){
            for(int j = str.length()-1; j >= 0; j--){
                int mask =1<<j; // Jth bit of mask is set i.e, 1; 
                if((i & mask) != 0){  //jth bit is on
                    System.out.print(str.charAt(str.length() - 1 - j));
                } else {
                    System.out.print('-');
                }
            }
            System.out.println();
        }
        scn.close();
    }
}