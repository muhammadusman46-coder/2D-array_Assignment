import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        double[][] matrix = new double[rows][cols];

        // Input matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        // Display matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Row sums
        System.out.println("\nRow sums:");
        for (int i = 0; i < rows; i++) {
            double rowSum = 0.0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + rowSum);
        }

        // Column sums
        System.out.println("\nColumn sums:");
        for (int j = 0; j < cols; j++) {
            double colSum = 0.0; // must reset for each column
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " = " + colSum);
        }

        // Diagonal sums 
        if (rows == cols) {
            double forwardDiagnol = 0.0, reverseDiagnol = 0.0;
            for (int i = 0; i < rows; i++) {
                forwardDiagnol += matrix[i][i];           
                reverseDiagnol += matrix[i][rows - 1 - i];   
            }
            System.out.println("\nSum of forward diagonal = " + forwardDiagnol);
            System.out.println("Sum of reverse diagonal = " + reverseDiagnol);
        } else {
            System.out.println("\nDiagonal sums not possible (not a square matrix)");
        }

        
    }
} 