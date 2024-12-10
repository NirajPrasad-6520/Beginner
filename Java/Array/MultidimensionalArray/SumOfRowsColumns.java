// Package declaration
package Array.MultidimensionalArray;
// Class to calculate the sum of rows and columns of a matrix
public class SumOfRowsColumns
{
    // Main method - program entry point
    public static void main(String[] args)
    {
        int rows, cols, sumRow, sumCol;

        // Define a 4x3 matrix
        int a[][] = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9},
                        {4, 5, 6},
                    };

        // Calculate the number of rows in the matrix
        rows = a.length;

        // Calculate the number of columns in the matrix
        cols = a[0].length;

        // Calculate the sum of each row
        for (int i = 0; i < rows; i++)
        {
            sumRow = 0; // Initialize the row sum to 0
            for (int j = 0; j < cols; j++)
            {
                sumRow += a[i][j]; // Add the elements of the current row
            }
            // Print the sum of the current row
            System.out.println("Sum of " + (i + 1) + " row: " + sumRow);
        }

        // Calculate the sum of each column
        for (int i = 0; i < cols; i++)
        {
            sumCol = 0; // Initialize the column sum to 0
            for (int j = 0; j < rows; j++)
            {
                sumCol += a[j][i]; // Add the elements of the current column
            }
            // Print the sum of the current column
            System.out.println("Sum of " + (i + 1) + " column: " + sumCol);
        }
    }
}