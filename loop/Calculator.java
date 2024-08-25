import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Select your operation: ");
        int ch =sc.nextInt();
        if(ch == 1){
            System.out.println(num1+num2);
        }
        else if(ch==2){
            System.out.println(num1-num2);
        }
        else if(ch==3){
            System.out.println(num1/num2);
        }
        else if(ch == 4){
            System.out.println(num1%num2);
        }
        else{
            System.out.println(num1*num2);
        }

            
    }
    
}
