package Recursion;
//Print x^n (stack height = logn).
public class Recursion7
{
    public static int calcpower(int x, int n)
    {
        // Base case: n == 0
        if (n == 0)
        {
            return 1;
        }

        // Recursive case
        // If n is even
        if (n % 2 == 0)
        {
            int halfPower = calcpower(x, n / 2); // Store the result to avoid redundant calculations
            return halfPower * halfPower;
        }
        else // If n is odd
        {
            int halfPower = calcpower(x, n / 2); // Store the result to avoid redundant calculations
            return halfPower * halfPower * x;
        }
    }
    public static void main(String[] args)
    {
        int x = 2, n = 5;
        int result = calcpower(x, n); // Compute 2^5
        System.out.println(result); // Output: 32
    }
}