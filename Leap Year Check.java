import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check if it is a leap year or not:");

        // Store the year
        int yr = sc.nextInt();

        // Check if the year is a leap year
        if (yr % 4 == 0) {
            System.out.println(yr + " is a Leap Year!");
        } else {
            System.out.println(yr + " is not a Leap Year!");
        }
    }
}
