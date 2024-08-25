import java.util.*;
public class calculateTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income:");
        int income=sc.nextInt();
        System.out.println("Enter the tax percentage of salary");
        int tax=sc.nextInt();
        int taxAmount=income*tax/100;
        System.out.println("Tax amount is: "+taxAmount);
        System.out.println("total salary after tax deduction "+(income-taxAmount));


    }
    
}
