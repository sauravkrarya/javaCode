import java.util.*;
public class Rupees {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your money");
        int rs=sc.nextInt();
        int divide=rs/2;
        System.out.println(divide);
        int gst=(divide*18)/100;
        System.out.println("gst of the money " + gst);
        System.out.println(gst+25+divide);



    }
    
}
