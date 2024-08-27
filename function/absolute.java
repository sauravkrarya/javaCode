import java.util.Scanner;

public class absolute {

  public static float absolute(float abs){
    return abs *-1;
  }

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        float abs =sc.nextFloat();
        float a =absolute(abs);
        System.out.println("Absolute value of the number is: " + a);
        
    }
    
    //saurav
}
