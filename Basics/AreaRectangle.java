import java.util.*;
public class AreaRectangle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int length=sc.nextInt();
        System.out.println("Enter the width of the rectangle:");
        int width=sc.nextInt(); 
        int area=length*width;
        System.out.println("The area of the rectangle is: "+area);
    }
}
