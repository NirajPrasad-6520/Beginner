package Array.SingleDimensionalArray;
// Program to take an array of names as input from the user and print them on the screen
import java.util.*;
public class NameArray
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number that represents how many names you want to add: ");
      int size = sc.nextInt(); // Read the number of names to be added
   
      String names[] = new String[size];
      
      System.out.println("Enter names:");

      // Input: Take names as input from the user
      for(int i = 0; i < size; i++)
          names[i] = sc.next(); // Read each name and store it in the array

      // Output: Display the names entered by the user
      for(int i = 0; i < names.length; i++)
         System.out.println("Name " + (i + 1) + " is: " + names[i]);
      sc.close();
   }
}