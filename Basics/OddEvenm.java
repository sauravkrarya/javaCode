
import java.util.Scanner;

public class OddEvenm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter a number:");
        float num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
                }


    }

}
