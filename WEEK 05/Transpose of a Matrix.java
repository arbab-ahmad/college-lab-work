import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Display the purpose of the program
        System.out.println("**This program is for finding Transpose of a matrix**\n");
        
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix:");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        int n = sc.nextInt();

        // Initialize the matrix
        int[][] arr = new int[m][n];

        // Input matrix elements
        System.out.println("Enter the elements of your matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        // Initialize and compute the transpose of the matrix
        int[][] tran = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tran[i][j] = arr[j][i];
            }
        }

        // Display the transposed matrix
        System.out.println("\nTranspose of the original matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(tran[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
