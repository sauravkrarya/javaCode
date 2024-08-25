import java.util.*;
public class Swapusing3var {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number for a=");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping a= "+a);
        System.out.println("after swapping b= "+b);


    }
    
}
