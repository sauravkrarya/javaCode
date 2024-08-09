import java.util.*;
public class if_else_ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("enter your name");
            String name = sc.next();
            System.out.println(name);
        }
        else if (choice == 2) {
            System.out.println("enter your age");
            int age = sc.nextInt();
            System.out.println(age);
        }
        else if(choice ==3){
            System.out.println("enter your roll no");
            int roll = sc.nextInt();
            System.out.println(roll);
        }
        else {
            System.out.println("wrong choice");
        }
    
}
}
