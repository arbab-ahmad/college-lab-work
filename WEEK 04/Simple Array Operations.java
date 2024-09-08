import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input for array size
        System.out.println("Enter the size of the array which you want to enter:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        // Taking input for array elements
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        // Displaying menu options
        System.out.println("\nSelect the operation which you want to perform:");
        System.out.println("1. Find the sum of all elements\n2. Find average of all elements\n3. Find the Minimum of all elements\n4. Find the Maximum of all elements");
        
        int sum = 0, max, min;
        float avg;
        int op = sc.nextInt();
        
        switch(op){
            case 1:
                // Calculating sum of all elements
                for(int j = 0; j < arr.length; j++){
                    sum = sum + arr[j];
                }
                System.out.println("Sum = " + sum);
                break;
                
            case 2:
                // Calculating average of all elements
                for(int j = 0; j < arr.length; j++){
                    sum = sum + arr[j];
                }
                avg = (float) sum / arr.length;
                System.out.println("Average = " + avg);
                break;
                
            case 3:
                // Finding minimum element
                min = arr[0];
                for(int j = 1; j < arr.length; j++){
                    if(arr[j] < min){
                        min = arr[j];
                    }
                }
                System.out.println("Minimum = " + min);
                break;
                
            case 4:
                // Finding maximum element
                max = arr[0];
                for(int j = 1; j < arr.length; j++){
                    if(arr[j] > max){
                        max = arr[j];
                    }
                }
                System.out.println("Maximum = " + max);
                break;
                
            default:
                System.out.println("Invalid operation! (Select an operation from the menu.)");
        }
    }
}
