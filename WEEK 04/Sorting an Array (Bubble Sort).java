import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("**THIS PROGRAM IS FOR PERFORMING BUBBLE SORT ON AN ARRAY**\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array which you want to sort: ");
        int n = sc.nextInt();  // Input size of the array
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of your array: ");
        
        // Input elements for the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Bubble sort logic
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {  // Swap if the current element is greater than the next element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        // Display the sorted array
        System.out.println("The array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
