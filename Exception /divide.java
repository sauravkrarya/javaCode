
// import java.lang.*;
import java.util.*;

class divide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first number");
            float a = sc.nextInt();
            System.out.println("Enter second number");
            float b = sc.nextInt();
            System.out.println("divison of two number is " +a/b);

            

        } catch (Exception e) {
            System.out.println("Error please enter valid input: ");
        }
        finally{
            System.out.println("you'r great man dude please do some interesting work");
        }

    }
}







// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class DivisionWithExceptionHandling {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         boolean validInput = false;

//         while (!validInput) {
//             try {
//                 // Prompting the user to enter two numbers
//                 System.out.print("Enter the first number: ");
//                 int num1 = scanner.nextInt();

//                 System.out.print("Enter the second number: ");
//                 int num2 = scanner.nextInt();

//                 // Perform division
//                 int result = num1 / num2;

//                 // Display the result
//                 System.out.println("The result of division is: " + result);
//                 validInput = true; // Input is valid, exit the loop
//             } catch (InputMismatchException e) {
//                 System.out.println("Invalid input. Please enter valid integers.");
//                 scanner.next(); // Clear the invalid input
//             } catch (ArithmeticException e) {
//                 System.out.println("Error: Division by zero is not allowed. Please enter a non-zero divisor.");
//             }
//         }

//         scanner.close();
//     }
// }

