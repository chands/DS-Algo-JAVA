import java.util.*;
public class TogglecharSB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scn.nextLine();
        System.out.println(Modify2(str));
        scn.close();
    }
    //Toggle uppercase to Lowercase and vice verca.
    private static String Togglechars(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
            ch = (char)(ch - 'a' + 'A');
            } else{
            ch = (char)(ch + 'a' - 'A');
            }
            sb.setCharAt(i, ch);
        }
        return sb.toString();
    }

    //modify even indexed ASCII char by -1 and odd by +1
    private static String Modify1(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(i%2 == 0){
                ch = (char)(ch-1);
            } else{
                ch = (char)(ch+1);
            }
            sb.setCharAt(i, ch);
        }
        return sb.toString();
    }
    //Insert gap between each char between the chars.
    private static String Modify2(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length()-1; i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i + 1);
            // here we need integer value as difference between two chars so use int.
            int gap = ch2 - ch1; 
            sb.append(ch1);
            sb.append(gap);
        }
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }
}