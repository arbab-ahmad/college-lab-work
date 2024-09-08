import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is even or odd:");

        // Store the number
        int n = sc.nextInt();

        // Check if the number is even or odd and print the result
        if (n % 2 == 0) {
            System.out.println(n + " is an even number!");
        } else {
            System.out.println(n + " is an odd number!");
        }
    }
}
