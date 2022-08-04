import java.util.Scanner;
public class StringOps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scn.nextLine();

        printChars(str);
        printSubStr(str); // to print all substrings.
        scn.close();
    }
    private static void printChars(String str) {
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }

    private static void printSubStr(String str) {
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}