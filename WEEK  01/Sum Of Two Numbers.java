import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers to find their sum : \n");

        // Prompt and store first integer
        System.out.println("Enter num 1 : ");
        int a = sc.nextInt();

        // Prompt and store second integer
        System.out.println("Enter num 2 : ");
        int b = sc.nextInt();

        // Calculate and display the sum
        System.out.println("Sum of " + a + " and " + b + " = " + (a + b));
    }
}
