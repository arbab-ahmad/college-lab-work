import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        System.out.println("**THIS PROGRAM IS FOR MULTIPLICATION OF TWO MATRICES**\n\n");
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input for the order of the first matrix
        System.out.println("Enter the order of your first matrix:");
        System.out.println("Enter the number of rows for matrix 1:");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns for matrix 1:");
        int n = sc.nextInt();
        
        int[][] m1 = new int[m][n];
        System.out.println("Enter the elements of matrix 1:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        
        // Taking input for the order of the second matrix
        System.out.println("\nEnter the order of your second matrix:");
        System.out.println("Enter the number of rows for matrix 2:");
        int p = sc.nextInt();
        System.out.println("Enter the number of columns for matrix 2:");
        int q = sc.nextInt();
        
        // Checking if matrix multiplication is possible
        if(m != q){
            System.out.println("\nInvalid input! (the number of columns in the first matrix must be equal to the number of rows in the second matrix.)");
            return;
        }
        
        int[][] m2 = new int[p][q];
        System.out.println("Enter the elements of matrix 2:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        
        // Multiplying the matrices and displaying the result
        int[][] m3 = new int[m][q];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                m3[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        
        System.out.println("\nMultiplication successful! The product matrix is as follows:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
