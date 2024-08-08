
import java.lang.*;
import java.util.*;

class divide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first number");
            float a = sc.nextInt();
            System.out.println("Enter second number");
            float b = sc.nextInt();
            System.out.println("divison of two number is " +a/b);


        } catch (Exception e) {
            System.out.println("Error please enter valid input: ");
        }
        finally{
            System.out.println("you'r great man dude please do some interesting work");
        }

    }
}
