//Write a Java program that uses a for-loop to calculate the factorial of a given number ‘N’.


import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to find factorial");
         int  n = sc.nextInt();
         long fact=1;
         for(int i=1;i<=n;i++){
             fact=fact*i;
         }
         System.out.println(fact);
      }
    
}
