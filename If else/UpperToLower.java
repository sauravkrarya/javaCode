// public class UpperToLower {
//     public static void main(String[] args) {
//         String str = "Hello World";
//         System.out.println("Original String: " + str);
//         System.out.println("Upper Case: " + str.toUpperCase());
//         System.out.println("Lower Case: " + str.toLowerCase());
//     }

// }
import java.util.*;

class UpperToLower {

    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            char ch2 = Character.toLowerCase(ch);
            System.out.println(ch2);
        }
        else{
            char ch3 = Character.toUpperCase(ch);
            System.out.println(ch3);
        }
    }
}
