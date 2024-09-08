import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("**THIS IS A SIMPLE CALCULATOR**\n");

        // Prompt the user to enter the numbers and operation
        System.out.println("Enter the numbers and the operation you want to perform:");

        System.out.println("Enter num 1 : ");
        float a = sc.nextFloat();

        System.out.println("Choose an operation (+,-,*,/,^):");
        char op = sc.next().charAt(0);

        System.out.println("Enter num 2 : ");
        float b = sc.nextFloat();

        // Perform the calculation based on the operation selected
        switch (op) {
            case '+':
                System.out.println("Sum = " + (a + b));
                break;
            case '-':
                System.out.println("Difference = " + (a - b));
                break;
            case '*':
                System.out.println("Product = " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Result not defined! (Divisor cannot be 0.)");
                } else {
                    System.out.println("Quotient = " + (a / b));
                }
                break;
            default:
                System.out.println("Not a valid operation!");
        }
    }
}
