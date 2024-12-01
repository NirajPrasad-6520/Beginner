package functions;

import java.util.Scanner;

public class factorial_function 
{
     public static void printFactorial(int n) 
     {
       //loop
       if(n < 0) 
       {
           System.out.println("Invalid Number");
           return;
       }

       int factorial = 1;

       for(int i = n; i >= 1; i--) 
       {
           factorial = factorial * i;
       }
       System.out.println("The factorial of " + n + " is " + factorial);
       return;
   }
   public static void main(String args[]) 
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter number : ");
       int n = sc.nextInt();
       printFactorial(n);
       sc.close();
   }
}
