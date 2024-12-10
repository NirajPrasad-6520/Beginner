package Recursion;
// Print a string in reverse using recursion
public class ReverseRecursion
{
    // Recursive method to print the string in reverse
    public static void printReverse(String str, int index)
    {
        // Base case: Empty string or reached the first character
        if (str.isEmpty())
        {
            System.out.println("The string is empty.");
            return;
        }

        if (index < 0)
        {
            return; // End of recursion
        }
        System.out.print(str.charAt(index)); // Print current character
        printReverse(str, index - 1); // Recursive call for the previous character
    }
    public static void main(String[] args)
    {
        String str = "abcd"; // Input string
        printReverse(str, str.length() - 1); // Start recursion from the last character
    }
}