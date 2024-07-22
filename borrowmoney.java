/*Geek borrowed money from two people A and B. He borrowed amount X1 from A, at an interest rate of R1% and amount X2 from B, at an interest rate of R2%. As exactly one year has passed since he borrowed the money, Geek needs to return the money back to A and B.
Can you help Geek find out to whom he owes more amount of interest money (that is the extra amount of money Geek needs to pay apart from the borrowed amount)?
If he owes both of them the same amount of interest, return "EQUAL". 
Input:
X1 = 100
R1 = 5%
X2 = 50
R2 = 10%
*/
import java.util.*;
public class borrowmoney {

     public static void A(double a, double b){
           double x =(a*5)/100;
           double y =(b*10)/100;
       if (x>y)
            System.out.println("person A will get more interest");
       else if(x<y)
            System.out.println("person B will get more interest");
       else
             System.out.println("EQUAL");
             System.out.println("After 1 year person A will get" + x);
             System.out.println("After 1 year person B will get" + y );
        
     }
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the money which geek borowed by person A ");
        double a =sc.nextDouble();
        System.out.println("Enter the money which geek borrowed by person B");
        double b =sc.nextDouble();
        
        A (a,b);
         }

}
