import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Introduction to the program
        System.out.println("Enter a number to check if it is Palindrome or not:");
        
        // Taking input for the number to be checked
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String rev = "";
        
        // Reversing the string representation of the number
        for(int i = 0; i <= num.length() - 1; i++) {
            rev = num.charAt(i) + rev;
        }
        
        // Checking if the number is a palindrome
        if(num.equals(rev)) {
            System.out.println(num + " is a Palindrome!");
        } else {
            System.out.println(num + " is not a Palindrome!");
        }
    }
}
