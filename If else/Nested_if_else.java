import java.util.*;
public class Nested_if_else {

    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter 1st no.");
     int x = sc.nextInt();
    System.out.println("enter 2nd no.");
    int y =sc.nextInt();
    if(x>5)
        {
            if (y > 10) {
                System.out.println("x is greater than 10");
            } else {
                System.out.println("x is greater than 5 but not greater than 10");
            }
        }
        else {
                System.out.println("x is less than or equal to 5");
                }

        }
    }

