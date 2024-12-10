package Recursion;
// Java Recursion Example to calculate the factorial of a number.
public class Recursion4
{
    static int factorial(int n)
    {
        // Base case: Factorial of 1 is 1.
        if (n == 1)
            return 1;

        // Recursive case: Multiply 'n' with the factorial of (n-1).
        else
            return (n * factorial(n - 1));
    }
    public static void main(String[] args)
    {
        // Calculate and print the factorial of 5.
        System.out.println("Factorial of 5 is: " + factorial(5));
    }
}
// Working of above program:
// factorial(5)
// factorial(4)
// factorial(3)
// factorial(2)
// factorial(1)
// return 1
// return 2*1 = 2
// return 3*2 = 6
// return 4*6 = 24
// return 5*24 = 120