import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number:");
        double n = sc.nextDouble();
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is " + fact);
            }

    
}
