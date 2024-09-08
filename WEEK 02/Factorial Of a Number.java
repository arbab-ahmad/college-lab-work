
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Introduction to the program
        System.out.println("Enter a number to find its Factorial:");
        
        // Taking input for the number whose factorial is to be calculated
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = x;
        int fact = 1;
        
        // Calculating factorial using a while loop
        while(n > 0) {
            fact = fact * n;
            n--;
        }
        
        // Printing the calculated factorial
        System.out.println("Factorial of " + x + " = " + fact);
    }
}
