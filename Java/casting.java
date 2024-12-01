import java.util.*;
public class casting
{

   public static void main(String[] args) 
   {

       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number according to data types");
       
       int a = input.nextInt();
       float f = input.nextFloat();
       double d = input.nextDouble();

       float x = (float)a;
       int y = (int)f;
       float z = (float)d;;   
       System.out.println("x = " + x + " y = " + y + " z = " + z);

       int marks1 = 20;
       int marks2 = 40;
       int marks3 = 50;

       double average = ((double)marks1 + (double)marks2 + (double)marks3)/3;
       System.out.println("Average of marks: " + average);

      // another example
        char xy = 'a';
        int value = (int)xy;
        System.out.println("ASCII Value of a: "  + value);
        input.close();
   }
}
