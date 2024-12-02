import java.util.Scanner;

public class Pattern_usingForLoop
{
   public static void main(String []args)
   {
      int rows;
      System.out.println("Enter rows:");
      Scanner sc = new Scanner(System.in);
      rows = sc.nextInt();

      //Right Triangle Star Pattern
      System.out.println("1. Right Triangle Star Pattern:");

         for(int i = 0; i < rows; i++)
         {
            for(int j = 0; j <= i; j++)
            {
               System.out.print("* ");
            }
            System.out.println();
         }
         System.out.println("\n");

      //Mirrored Right Triangle Star Pattern
      System.out.println("2. Mirrored Right Triangle Star Pattern:");

         for(int i = 1; i <= rows; i++)
         {
             for(int j = (rows - i) * 2; j >= 1; j--)
               System.out.print(" ");
            for(int j = 1; j <= i ; j++)
               System.out.print("* ");
            System.out.println();
         }
         System.out.println("\n");

      //Downward Right Triangle Star Pattern
      System.out.println("3. Downward right triangle star pattern:");

         for(int i = 0; i < rows; i++)
         {
            for(int j = 0; j < rows - i; j++)
               System.out.print("* ");
            System.out.println();
         }
         System.out.println("\n");

      //Mirrored downward right triangle star pattern
      System.out.println("4. Mirrored downward right triangle star pattern:");

         for (int i = rows; i >= 1; i--) 
               {
                  for (int j = 1; j <= rows - i; j++)
                        System.out.print("  ");
                  for (int j = 1; j <= i; j++) 
                        System.out.print("* ");
                  System.out.println();
               }
               System.out.println("\n");

      //Pyramid Star Pattern
      System.out.println("5. Pyramid Star Pattern:");

         for(int i = 0; i < rows; i++)
         {
            for(int j = rows - i - 1; j >= 1; j--)
               System.out.print(" ");
            for(int j = 0; j <= i; j++)
               System.out.print("* ");
            System.out.println();
         }
      System.out.println("\n");

      // Reverse Pyramid Star Pattern
      System.out.println("6. Reverse Pyramid Star Pattern:");

         for(int i = 0; i < rows; i++)
         {
            for(int j = 0; j < i; j++)
               System.out.print(" ");
            for(int j = i; j < rows; j++)
               System.out.print("* ");
            System.out.println();
         }
         System.out.println("\n");

      //Diamond shape Star Pattern
      System.out.println("7. Diamond shape Star Pattern:");

         for(int i = 0; i < rows; i++)
         {
            for(int j = 0; j < rows - i - 1; j++)
               System.out.print(" ");
            for(int j = 0; j <= i; j++)
               System.out.print("* ");
            System.out.println();
         }

         for(int i = 0; i < rows - 1; i++)
         {
            for(int j = 0; j <= i; j++)
            {
               System.out.print(" ");
            }
            for(int j = 0; j < rows - i - 1; j++)
               System.out.print("* ");
            System.out.println();
         }
         System.out.println("\n");

      //Number Triangle Pattern
      System.out.println("8. Number Triangle Pattern:");

         for(int i = 1; i <= rows; i++)
      {
            for(int j = 1;j <= i; j++)
            {
               System.out.print(j + " ");
            }
            System.out.println();
      }
      System.out.println("\n");

      //Reverse Number pattern
      System.out.println("9. Reverse number triangle pattern");

      for(int i = 1; i <= rows; i++)
      {
         for(int j = 1; j <= rows - i + 1; j++)
         {
            System.out.print(j + " ");
         }
         System.out.println();
      }
      System.out.println("\n");

        //Floyd Triangle
      System.out.println("10. Floyd Triangle:");

      int number = 1;
      for(int i = 1; i <= rows; i++)
      {
         for(int j = 1; j <= i; j++)
         {
            System.out.print(number + " ");
            number++;
         }
         System.out.println();
      }
      System.out.println("\n");

        //0,1 Triangle
      System.out.println("11. 0-1 Triangle:");

      for(int i = 1; i <= rows; i++)
      {
         for(int j = 1; j <= i; j++)
         {
            int sum = i + j;
            if(sum % 2== 0)
               System.out.print("1 ");
            else
               System.out.print("0 ");
         }
         System.out.println();
      }
      System.out.println("\n");

      //Hollow Rectangle
      System.out.println("12. Hollow Rectangle :");
      int n = 6;
      int m = 20;

      for(int i = 1; i <= n; i++)
      {
         for(int j = 1; j <= m; j++){
            if(i == 1 || j == 1 || i == n || j == m)
            {
               System.out.print("* ");
            }
            else
            {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
      System.out.println("\n");

        //Square Pattern
      System.out.println("13. Square Pattern:");
      int p = 5;

      for(int i = 1; i <= p; i++)
      {
         for(int j = 1;j <= p; j++)
         {
            System.out.print("& ");
         }
         System.out.println();
      }
      System.out.println("\n");

        //Butterfly pattern
      System.out.println("14. Butterfly Pattern: ");
        //upper half
      for(int i = 1; i <= rows; i++)
      {
         //1st part
         for(int j = 1; j <= i; j++)
         {
            System.out.print("* ");
         }

         //spaces
         int spaces = 2 * (rows - i);
         for(int j = 1; j <= spaces; j++)
         {
            System.out.print("  ");
         }

         //2nd part
         for(int j = 1; j <= i; j++)
         {
            System.out.print("* ");
         }
         System.out.println();
      }

        //lower half
      for(int i = rows; i >= 1; i--)
      {
         //1st part
         for(int j = 1; j <= i; j++)
         {
            System.out.print("* ");
         }

         //spaces
         int spaces = 2 * (rows - i);
         for(int j = 1; j <= spaces; j++)
         {
            System.out.print("  ");
         }

         //2nd part
         for(int j = 1; j <= i; j++)
         {
            System.out.print("* ");
         }
         System.out.println();
      }
      System.out.println("\n");

        //solid Rhomus
      System.out.println("15. Solid Rhomus:");

      for(int i = 1; i <= rows; i++)
      {
         //spaces
         for(int j = 1; j <= rows - i; j++)
         {
            System.out.print("  ");
         }

         //stars
         for(int j = 1; j <= rows; j++)
         {
            System.out.print("* ");
         }
         System.out.println();
      }
      System.out.println("\n");

        //Number Pyramid
      System.out.println("16. Number Solid:");
      
      for(int i = 1; i <= rows; i++)
      {
         //spaces
         for(int j = 1; j <= rows - i; j++)
         {
            System.out.print("  ");
         }

         //numbers
         for(int j = 1; j <= i; j++)
         {
            System.out.print(i + "   ");
         }
         System.out.println();
      }
      System.out.println("\n");
      sc.close();
   }
}