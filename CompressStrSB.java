import java.util.Scanner;
public class CompressStrSB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scn.nextLine();
        System.out.println(Compress1(str));
        System.out.println(Compress2(str));
        scn.close();
    }

    private static String Compress1(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length()-1; i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if(ch1 != ch2){
                sb.append(ch1);
            }
        }
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }

    private static String Compress2(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i < str.length()-1; i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            if(ch1 == ch2){
                count++;
            }
            if(ch1!=ch2){
                sb.append(ch1);
                if(count>1){
                    sb.append(count);
                }
                count =1;
            }
        }
        sb.append(str.charAt(str.length()-1));
        sb.append(count);
        return sb.toString();
    }
}