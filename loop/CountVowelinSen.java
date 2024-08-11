import java.util.*;
public class CountVowelinSen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if( (ch == 'a') || (ch == 'e') || (ch == 'i') 
            || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I') 
            || (ch == 'o') || (ch == 'U') ){
                count++;
            }
        }
        System.out.println("count: "+count);



    }
}
