import java.util.*;
public class If {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("pease enter value which you want");
        int input=sc.nextInt();
        if(input>0){
            System.out.println("positive number");
        }
        else if(input<0){
            System.out.println("negative number");
        }
        else
        {
        System.out.println("please input valid number instead 0");
        }
    }
    
}
