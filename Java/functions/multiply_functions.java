package functions;

import java.util.Scanner;
public class multiply_functions
{
   //Multiply 2 numbers
    public static int multiply(int a, int b)
    {
       return a * b;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        
        int result = multiply(a, b);
        System.out.println("Multiply of a and b : " + result);
        sc.close();
    }
}