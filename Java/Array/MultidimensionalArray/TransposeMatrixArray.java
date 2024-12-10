package Array.MultidimensionalArray;
// Class declaration for TransposeMatrixArray
public class TransposeMatrixArray
{
   public static void main(String[] args)
   {
      // Initialize a 3x3 matrix
         int original[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

      // Create another matrix to store the transpose of the original matrix
        int transpose[][] = new int[3][3];  // 3 rows and 3 columns

        // Code to compute the transpose of the matrix
        for(int i = 0; i < 3; i++) // Loop through rows
            {
               for(int j = 0; j < 3; j++) // Loop through columns
                  {
            // Assign the value from the original matrix to the transpose matrix
                     transpose[i][j] = original[j][i];
                  }
            }

      System.out.println("Printing Matrix without transpose:");
        for(int i = 0; i < 3; i++) // Loop through rows
         {
            for(int j = 0; j < 3; j++) // Loop through columns
               {
                // Print each element of the original matrix
                  System.out.print(original[i][j] + " ");
               }
            // Move to the next line after printing a row
               System.out.println();
      }
      System.out.println("Printing Matrix After Transpose:");
        for(int i = 0; i < 3; i++) // Loop through rows
      {
            for(int j = 0; j < 3; j++) // Loop through columns
            {
                // Print each element of the transposed matrix
               System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
      }
   }
}