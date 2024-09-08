import java.util.*;
public class Main {

    public static void main(String[] args) {
        // Introduction to the program
        System.out.println("**This Program is for printing Fibonacci Sequence**\n");
        
        // Taking input for the number of terms to print in the sequence
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to print :");
        int n = sc.nextInt();
        
        // Array to store the Fibonacci sequence
        int arr[] = new int[n];
        
        // Initializing the first two terms of the sequence
        arr[0] = 0;
        arr[1] = 1;
        
        // Calculating the remaining terms using a loop
        for(int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        
        // Printing the Fibonacci sequence
        System.out.println("First "+ n + " term of the Fibonacci Series are as follows :");
        for(int j = 0; j < n; j++) {
            System.out.print(arr[j] + " | ");
        }
    }
}
