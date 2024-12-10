package Array.MultidimensionalArray;
// Class definition for Matrix addition and multiplication
public class MatrixAdditionAndMultiplyArray
{

    // Main method - the program entry point
    public static void main(String[] args)
    {
        // Addition of two matrices
        System.out.println("Addition Matrix :");
        
        // Define two 3x3 matrices
        int a[][] = { {1, 3, 4}, {2, 4, 3}, {3, 4, 5} };
        int b[][] = { {1, 3, 4}, {2, 4, 3}, {1, 2, 4} };

        // Declare a 3x3 result matrix for addition
        int[][] arr = new int[3][3];

        // Perform addition of the two matrices element by element
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arr[i][j] = a[i][j] + b[i][j]; // Add corresponding elements
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Multiplication of two matrices
        System.out.println("Multiply Matrix :");
        
        // Perform multiplication of the two matrices element by element
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arr[i][j] = a[i][j] * b[i][j]; // Multiply corresponding elements
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}