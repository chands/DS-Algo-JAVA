import java.util.Scanner;
public class StrPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scn.nextLine();

        printPelindromeSubStr(str); // to print all pelindrome substrings.
        int start = 0;
        int end = str.length()-1;
        System.out.println(isPalindromeRec(str, start, end));
        scn.close();
    }

    private static void printPelindromeSubStr(String str) {
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                String substr = str.substring(i, j);
                if(ispalindrome(substr)){
                    System.out.println(substr);;
                }
            }
        }
    }

    private static boolean ispalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        //boolean flag = true;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                //flag = false;
                //break;
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    //Recursive solution for isPelindrome: time complexity O(n).
    private static boolean isPalindromeRec(String str, int start, int end) {
        if(start >= end)
            return true;
        return ((str.charAt(start) == str.charAt(end)) && isPalindromeRec(str, start + 1, end - 1));
    }
}