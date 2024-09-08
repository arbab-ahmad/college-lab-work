import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("**THIS PROGRAM IS FOR MATRIX-MATRIX ADDITION OF TWO MATRICES**\n\n");
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input for the order of the first matrix
        System.out.println("Enter the order of your first matrix:");
        System.out.println("Enter the number of rows for matrix 1:");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns for matrix 1:");
        int n = sc.nextInt();
        
        int matrix1[][] = new int[m][n];
        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        
        // Taking input for the order of the second matrix
        System.out.println("\nEnter the order of your second matrix:");
        System.out.println("Enter the number of rows for matrix 2:");
        int p = sc.nextInt();
        System.out.println("Enter the number of columns for matrix 2:");
        int q = sc.nextInt();
        
        // Checking if matrix addition is possible
        if(p != m || q != n){
            System.out.println("\nInvalid input! (order of both the matrices must be the same)");
            return;
        }
        
        int matrix2[][] = new int[p][q];
        System.out.println("Enter the elements of matrix 2:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        // Adding the matrices and displaying the result
        System.out.println("The matrices are successfully added!\n\nThe resultant matrix is as follows:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(matrix1[i][j] + matrix2[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
