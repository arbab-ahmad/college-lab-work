import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Initialize two sorted arrays
        int[] arr1 = {01, 30, 40};
        int[] arr2 = {4, 5, 6, 7, 8, 9, 10};
        
        // Determine the size of the merged array
        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];

        // Initialize pointers for both arrays and the merged array
        int i = 0, j = 0, k = 0;

        // Merge both arrays while comparing elements
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                i++;
            } else {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from arr2 if any
        if (i >= arr1.length) {
            while (j < arr2.length) {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        } else { // Copy remaining elements from arr1 if any
            while (k < size) {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
        }

        // Print the merged array
        for (int l = 0; l < size; l++) {
            System.out.print(arr3[l] + "  ");
        }
    }
}
