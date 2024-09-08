import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to find the largest of them:");

        // Store the three numbers
        System.out.println("Enter num 1 :");
        int a = sc.nextInt();

        System.out.println("Enter num 2 :");
        int b = sc.nextInt();

        System.out.println("Enter num 3 :");
        int c = sc.nextInt();

        // Compare and find the largest number
        if (a > b && a > c) {
            System.out.println(a + " is the greatest!");
        } else if (b > a && b > c) {
            System.out.println(b + " is the greatest!");
        } else {
            System.out.println(c + " is the greatest!");
        }
    }
}
