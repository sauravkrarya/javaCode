import java.util.*;
class hcf{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter first number");
        double first=sc.nextDouble();
        System.out.println("enter second number");
        double second=sc.nextDouble();
        int  hcf = 1;
        for (int i = 1; i <= first || i <= second; i++)
             {
               if  (first % i == 0 && second % i == 0)
                 hcf = i;
              }
              System.out.println("The hcf of these number: "+ hcf);
        }

    }

// dsd
// ds

