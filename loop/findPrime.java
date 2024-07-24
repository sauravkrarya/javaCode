import java.util.Scanner;

public class findPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        System.out.println("Prime numbers between 1 and " + N + " are:");
        
        // Iterate over each number from 2 to N
        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            
            // Check if the current number i is a prime number
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            // If the number is prime, print it
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
