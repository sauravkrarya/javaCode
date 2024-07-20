/*Geek borrowed money from two people A and B. He borrowed amount X1 from A, at an interest rate of R1% and amount X2 from B, at an interest rate of R2%. As exactly one year has passed since he borrowed the money, Geek needs to return the money back to A and B.
Can you help Geek find out to whom he owes more amount of interest money (that is the extra amount of money Geek needs to pay apart from the borrowed amount)?
If he owes both of them the same amount of interest, return "EQUAL". 
Input:
X1 = 100
R1 = 5
X2 = 50
R2 = 10
*/

import java.util.*;
class borrowedmoney{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the money which geek borowed by person A");
        long X1=sc.nextLong();
        System.out.println("enter the rate of interest for person A");
        int R1=sc.nextInt();
        System.out.println("Enter the money which geek borowed by person B");
        long X2=sc.nextLong();
        System.out.println("enter the rate of interest for personB");
        int R2=sc.nextInt();
        long interest_A=(X1*R1)/100;
        long interest_B=(X2*R2)/100;
        if (interest_A>interest_B)
                     System.out.println("person A will get more interest");
            else if(interest_A<interest_B)
                     System.out.println("person B will get more interest");
             else
                     System.out.println("EQUAL");
             System.out.println("interest_A : " +interest_A);
            System.out.println("interest B : " +interest_B);
    }
}




    