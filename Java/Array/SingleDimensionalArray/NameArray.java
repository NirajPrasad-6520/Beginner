package Array.SingleDimensionalArray;
// Take an array of names as input from the user and print them on the screen.
import java.util.*;
public class NameArray 
{
   public static void main(String args[]) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number that how many name's you want to add: ");
      int size = sc.nextInt();//here size means how many name's you want to add so give number for size. for example if size = 3 then 3 name add.
      String names[] = new String[size];
      System.out.println("Enter name :");
      
      //input
      for(int i = 0; i < size; i++) 
          names[i] = sc.next();

      //output
       for(int i = 0; i < names.length; i++) 
           System.out.println("Name " + (i + 1) +" is : " + names[i]);
      sc.close();
   }

}
