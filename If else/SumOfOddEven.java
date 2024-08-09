//0+2+4+6+8
//1+3+5+7+9

import java.util.*;

public class SumOfOddEven {

    int sum = 0, i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        if ((n & 1) == 1) {
            System.out.println("odd");
            SumOfOddEven s = new SumOfOddEven();
            s.sumOfOdd(n);
        } else {
            System.out.println("even");
            SumOfOddEven s = new SumOfOddEven();
            s.sumOfEven(n);
        }
    }

    public void sumOfOdd(int n) {
        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum of odd numbers is " + sum);
    }

    public void sumOfEven(int n) {
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum of even numbers is " + sum);
    }
}
