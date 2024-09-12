import java.util.*;
class Divisiblebyfive{
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        if(num%5==0){
            System.out.println("divisible by 5");
        
        }
        else{
            System.out.println("not divsible by 5");
        }
    }
}