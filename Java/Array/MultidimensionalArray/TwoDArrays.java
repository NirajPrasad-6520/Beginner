package Array.MultidimensionalArray;
// Importing the Scanner class for user input
import java.util.*;

public class TwoDArrays
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows number:");
        int rows = sc.nextInt();
        System.out.println("Enter columns number:");
        int columns = sc.nextInt();

        // Declare and initialize a 2D array with the specified dimensions
        int [][] numbers = new int[rows][columns];
        System.out.println("Enter matrix numbers:");

        // Input elements into the 2D array
        for(int i = 0; i < rows; i++) // Loop through rows
        {
            for(int j = 0; j < columns; j++) // Loop through columns
            {
                // Read each element and store it in the array
                numbers[i][j] = sc.nextInt();
            }
        }
        // Print the elements of the matrix
        System.out.println("Output:");

        // Output the 2D array in matrix format
        for(int i = 0; i < rows; i++) // Loop through rows
        {
            for(int j = 0; j < columns; j++) // Loop through columns
            {
                // Print each element in the row
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}