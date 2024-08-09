import java.util.*;
public class SumOfN_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n no number which you want to add");
        int n = sc.nextInt();
         int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            System.out.println(sum);
        }
    }
    
}
