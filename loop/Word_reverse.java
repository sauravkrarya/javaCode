import java.util.*;
public class Word_reverse {

    public static void main(String[] args) {
        Scanner pappu = new Scanner(System.in);
        System.out.println("enter a name: ");
        String name = pappu.next();
        String reversesd = "";
        for (int i = name.length() - 1; i >= 0; i--)
        reversesd = reversesd + name.charAt(i);
        System.out.println("reversed name is: " + reversesd);

    }
}
