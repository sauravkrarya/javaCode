import java.util.*;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("enter the second number");
        int m=sc.nextInt();
        int max=(n>m)?n:m;
        System.out.println(max);
    }
    
}
