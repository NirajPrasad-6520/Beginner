import java.util.Scanner;

public class Pattern_usingForLoop
{
   public static void main(String []args)
   {
      int rows;
      // Taking input for the number of rows from the user
      System.out.println("Enter rows:");
      Scanner sc = new Scanner(System.in);
      rows = sc.nextInt();

      // Right Triangle Star Pattern
      System.out.println("1. Right Triangle Star Pattern:");
      for(int i = 0; i < rows; i++)
      {
         for(int j = 0; j <= i; j++)
         {
            System.out.print("* "); // Print stars for each column
         }
         System.out.println(); // Move to the next row
      }
      System.out.println("\n");

      // Mirrored Right Triangle Star Pattern
      System.out.println("2. Mirrored Right Triangle Star Pattern:");
      for(int i = 1; i <= rows; i++)
      {
         for(int j = 1; j <= rows - i; j++) // Print spaces for mirroring
         {
            System.out.print("  ");
         }
         for(int j = 1; j <= i ; j++) // Print stars
            {
               System.out.print("* ");
            }
         System.out.println();
      }
      System.out.println("\n");

      // Downward Right Triangle Star Pattern
      System.out.println("3. Downward right triangle star pattern:");
      for(int i = 0; i < rows; i++)
      {
         for(int j = 0; j < rows - i; j++) // Print stars decreasing in each row
            {
               System.out.print("* ");
            }
            System.out.println();
      }
      System.out.println("\n");

      // Mirrored downward right triangle star pattern
      System.out.println("4. Mirrored downward right triangle star pattern:");
      for (int i = rows; i >= 1; i--)
      {
         for (int j = 1; j <= rows - i; j++) // Print spaces for mirroring
            {
               System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) // Print stars
            {
               System.out.print("* ");
            }
            System.out.println();
      }
      System.out.println("\n");

      // Pyramid Star Pattern
      System.out.println("5. Pyramid Star Pattern:");
      for(int i = 0; i < rows; i++)
      {
         for(int j = 1 ; j <= rows - i; j++) // Print spaces for centering
            {
               System.out.print(" ");//this code is same as Mirrored Right Triangle Star Pattern but a small difference in the space.
            }
            for(int j = 0; j <= i; j++) // Print stars for pyramid shape
            {
               System.out.print("* ");
            }
            System.out.println();
      }
      System.out.println("\n");

      // Reverse Pyramid Star Pattern
      System.out.println("6. Reverse Pyramid Star Pattern:");
      for(int i = 0; i < rows; i++)
      {
         for(int j = 0; j < i; j++) // Print spaces for centering
            {
               System.out.print(" ");
            }
            for(int j = i; j < rows; j++) // Print stars decreasing per row
            {
               System.out.print("* ");
            }
            System.out.println();
      }
      System.out.println("\n");

      // Diamond Shape Star Pattern
      System.out.println("7. Diamond shape Star Pattern:");
      for(int i = 0; i < rows; i++)// Upper half of the diamond
      {
         for(int j = 0; j < rows - i - 1; j++) // Print spaces
            {
               System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) // Print stars
            {
               System.out.print("* ");
            }
            System.out.println();
      }
      for(int i = 0; i < rows - 1; i++)// Lower half of the diamond
      {
         for(int j = 0; j <= i; j++) // Print spaces
            {
               System.out.print(" ");
            }
            for(int j = 0; j < rows - i - 1; j++) // Print stars
            {
               System.out.print("* ");
            }
            System.out.println();
      }
      System.out.println("\n");

      // Number Triangle Pattern
      System.out.println("8. Number Triangle Pattern:");
      for(int i = 1; i <= rows; i++)
      {
         for(int j = 1;j <= i; j++) // Print numbers sequentially
            {
               System.out.print(j + " ");
            }
            System.out.println();
      }
      System.out.println("\n");

      // Reverse Number Triangle Pattern
      System.out.println("9. Reverse number triangle pattern:");
      for(int i = 1; i <= rows; i++)
      {
         for(int j = 1; j <= rows - i + 1; j++) // Print numbers in decreasing rows
            {
               System.out.print(j + " ");
            }
            System.out.println();
      }
      System.out.println("\n");

      // Floyd Triangle
      System.out.println("10. Floyd Triangle:");
      int number = 1;
      for(int i = 1; i <= rows; i++)
      {
         for(int j = 1; j <= i; j++)
         {
            System.out.print(number + " "); // Increment and print numbers
            number++;
         }
         System.out.println();
      }
      System.out.println("\n");

      // 0-1 Triangle
      System.out.println("11. 0-1 Triangle:");
      for(int i = 1; i <= rows; i++)
      {
         for(int j = 1; j <= i; j++)
         {
            int sum = i + j;
            if(sum % 2 == 0) // Check for even/odd to print 1/0
               {
                  System.out.print("1 ");
               }
            else
               {
                  System.out.print("0 ");
               }
         }
         System.out.println();
      }
      System.out.println("\n");

      // Hollow Rectangle
      System.out.println("12. Hollow Rectangle :");
      int n = 6; // Rows of the rectangle
      int m = 20; // Columns of the rectangle
      for(int i = 1; i <= n; i++)
      {
         for(int j = 1; j <= m; j++)
         {
            if(i == 1 || j == 1 || i == n || j == m) // Print border stars
               {
                  System.out.print("* ");
               }
            else
               {
                  System.out.print("  ");// Print spaces for hollow
               }
         }
         System.out.println();
      }
      System.out.println("\n");

      // Square Pattern
      System.out.println("13. Square Pattern:");
      int p = 5; // Side length of the square
      for(int i = 1; i <= p; i++)
      {
         for(int j = 1;j <= p; j++) // Print fixed size square
            {
               System.out.print("& ");
            }
            System.out.println();
      }
      System.out.println("\n");

      // Butterfly Pattern
      System.out.println("14. Butterfly Pattern:");
      for(int i = 1; i <= rows; i++)// Upper half
      {
         for(int j = 1; j <= i; j++) // First half stars
            {
               System.out.print("* ");
            }
         for(int j = 1; j <= 2 * (rows - i); j++) // Spaces in the middle
            {
               System.out.print("  ");
            }
         for(int j = 1; j <= i; j++) // Second half stars
            {
               System.out.print("* ");
            }
         System.out.println();
      }
      for(int i = rows; i >= 1; i--)// Lower half
      {
         for(int j = 1; j <= i; j++) // First half stars
            {
               System.out.print("* ");
            }
         for(int j = 1; j <= 2 * (rows - i); j++) // Spaces in the middle
            {
               System.out.print("  ");
            }
         for(int j = 1; j <= i; j++) // Second half stars
            {
               System.out.print("* ");
            }
         System.out.println();
      }
      System.out.println("\n");

      // Solid Rhombus
      System.out.println("15. Solid Rhombus:");
      for(int i = 1; i <= rows; i++)
      {
         for(int j = 1; j <= rows - i; j++) // Spaces for alignment
            {
               System.out.print("  ");
            }
         for(int j = 1; j <= rows; j++) // Print full stars
            {
               System.out.print("* ");
            }
         System.out.println();
      }
      System.out.println("\n");

      // Number Pyramid
      System.out.println("16. Number Solid:");
      for(int i = 1; i <= rows; i++)
      {
         for(int j = 1; j <= rows - i; j++) // Spaces for centering
            {
               System.out.print("  ");
            }
         for(int j = 1; j <= i; j++) // Print repeated numbers in pyramid shape
            {
               System.out.print(i + "   ");
            }
            System.out.println();
      }
      System.out.println("\n");

      sc.close(); // Close scanner to free resources
   }
}