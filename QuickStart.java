// import java.util.*;

// public class QuickStart {
//     public static void main(String[] args) {
//         //System.out.print("*****\n****\n***\n**\n*\n");
//         //System.out.println(Math.pow(2,3));

//         //int exp= (int)Math.pow(2,3);
//         //System.out.println(exp);
        
//         // System.out.print("    *    \n");
//         // System.out.print("   * *   \n");
//         // System.out.print("  * * *  \n");
//         // System.out.print(" * * * * \n");
//         // System.out.print("* * * * *\n");
//         // int i = 10;
//         // if(i++ == i)
//         //   System.out.println(i + " is good");
//         // else
//         //   System.out.println(i + " is bad");
     
//         // int j = 20;
//         // if(++j == j)
//         //   System.out.println(j + " is good");
//         // else
//         //   System.out.println(j + " is bad");
//     //A number is prime or not?
//       Scanner scn = new Scanner(System.in);
//       System.out.print("Enter a number:");
//       int n = scn.nextInt();
//       if(n<1||n>=40)
//          System.out.println("Enter Number in the range of [1,40)");
//       else
//       {
//       int pre=0, nxt=0,n1,i;
//       for(i=1;i<=n;i++){
//           if(i<=2){
//                n1=i-1;
//           }
//           else{
//                n1=pre+nxt;
//             }
//       pre=nxt;
//       nxt=n1;
//       System.out.println(n1);
//         }
//       }
      
//     }
// }

//Print Z
// import java.util.*;

// public class testing {

//     public static void main(String[] args) {
//         // Write your code here
//         System.out.println("*****\n   *\n  *\n *\n*****");

//     }
// }

// print all subsets of an array
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        
        for(int i = 0; i<(int)Math.pow(2, a.length); i++){
            int temp = i;
            int b=0;
            String sets = "";
            for(int j = a.length-1; j>=0; j--){
                b = temp%2;
                temp = temp/2;
                if(b==0){
                    sets = "-\t" + sets;
                } else{
                    sets = a[j]+ "\t" + sets;
                    
                }
            }
            System.out.println(sets);

        }
        scn.close();
    }
}