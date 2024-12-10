package Recursion;

// This class demonstrates a simple example of recursion to print numbers from 1 to 5.
public class Recursion2
{
    // A recursive method to print numbers from the current value 'n' up to 5.
    public static void printnumber(int n)
    {
        // Base case: If 'n' equals 6, stop the recursion to prevent further calls.
        if (n == 6)
        {
            return; // Exits the current recursive call.
        }
        // Print the current value of 'n'.
        System.out.println(n);

        // Recursive call: Increment 'n' and call the method again.
        printnumber(n + 1);
    }

    // Main method to execute the program.
    public static void main(String[] args)
    {
        int n = 1; // Starting number for the sequence.
        printnumber(n); // Call the recursive method with the starting value.
    }
}