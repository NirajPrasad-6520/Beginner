//In this program using "Without User Input","User Input",also use "Even or Odd".
import java.util.*;
public class ifelse 
{
    public static void main(String args[])
    {
        int number = 10;
        if(number > 0)
        {
            System.out.println("The number " + number + " is greater than 0.\n");
        }
        else if(number < 0)
        {
            System.out.println("The number " + number + " is less than 0.\n");
        }
        else 
        {
            System.out.println("The number is 0.\n");
        }


        //User Input code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check given number is Greater than 0 or Not :");
        int num = sc.nextInt();

        if(num > 0)
        {
            System.out.println("The number is greater than 0.\n");
        }
        else if (num < 0)
        {
            System.out.println("The number is less than 0\n");
        }
        else 
        {
            System.out.println("The number is 0.\n");
        }  

        //Even Or Odd 
        System.out.println("Enter any number to check even or odd :");
        int num1 = sc.nextInt();
        
        if(num1 %2 == 0)
        {
            System.out.println("The number " + num1 + " is Even.\n");
        }
        else
        {
            System.out.println("The number " + num1 + " is Odd.\n");
        }
        sc.close();
    }
    
}
