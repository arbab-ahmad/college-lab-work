import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("**THIS PROGRAM IS FOR FINDING THE LARGEST ELEMENT IN AN ARRAY**\n\n");
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input for array size and elements
        System.out.println("Enter the size of the array which you want to enter:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of your array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Finding the largest element
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element in your array is " + largest);
    }
}
