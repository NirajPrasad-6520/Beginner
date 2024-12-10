package Recursion;
// Java Recursion Example to Print Fibonacci Sequence
public class Recursion5
{
    // Variables to hold the Fibonacci sequence numbers
    static int n1 = 0, n2 = 1, n3 = 0;

    // Recursive method to generate and print Fibonacci numbers
    static void printFibo(int count)
    {
        // Base case: When count reaches 0, recursion stops
        if (count > 0)
        {
            n3 = n1 + n2; // Calculate the next Fibonacci number
            n1 = n2;      // Update n1 to the value of n2
            n2 = n3;      // Update n2 to the value of n3
            System.out.print(" " + n3); // Print the current Fibonacci number
            printFibo(count - 1); // Recursive call with decremented count
        }
    }
    public static void main(String[] args)
    {
        int count = 7; // Number of Fibonacci terms to print
        System.out.print(n1 + " " + n2);// Printing the first two Fibonacci numbers
        printFibo(count - 2); // Call recursive method (count-2 because 2 numbers are already printed)
    }
}