import java.util.*;
public class maxOfTwoNo {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("enter first number");
       int a = sc.nextInt();
       System.out.println("enter second number");
       int b = sc.nextInt();

        int max=0;
        if(a>b){
            max=a;
            }
            else{
                max=b;
                }
        System.out.println("Maximum of given numbers is: " + max);
        
    }
    
}
