import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Introduction to the program
        System.out.println("Enter a number which you want to reverse:");
        
        // Taking input for the number to be reversed
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        int rem;
        
        // Reversing the number using a while loop
        while(n > 0) {
            rem = n % 10;
            str = str + rem;
            n = n / 10;
        }
        
        // Printing the reversed number
        System.out.println(str);
    }
}
