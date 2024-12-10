package Recursion;
//Print x^n (stack height = n).

public class Recursion6
{
    // Recursive method to calculate x^n
    public static int power(int x, int n)
    {
        // Base case: any number raised to the power of 0 is 1
        if (n == 0)
        {
            return 1;
        }
        else
        {
            // Recursive step: x * (x^(n-1))
            return x * power(x, n - 1);
        }
    }
    public static void main(String[] args)
    {
        int x = 2, n = 5; // Variables for base and exponent
        int result = power(x, n); // Compute x^n using recursion
        
        System.out.println(x + "^" + n + " = " + result);
    }
}