package Recursion;
// Find the first & last occurrence of an element in a string.
// Element = 'a'
public class Recursion9
{
    // Helper function to find occurrences
    public static void findOccurrence(String str, int idx, char element, int[] result)
    {
        if (idx == str.length())
        {
            return; // Base case: End of the string
        }
        // Get the current character
        char currChar = str.charAt(idx);

        // Check if it matches the target element
        if (currChar == element)
        {
            if (result[0] == -1)
            {
                result[0] = idx; // Update first occurrence
            }
            result[1] = idx; // Update last occurrence
        }
        // Recursive call
        findOccurrence(str, idx + 1, element, result);
    }
    public static void main(String[] args)
    {
        String str = "abaacdaefaah";
        char element = 'a';
        
        // Array to store first and last occurrence
        int[] result = {-1, -1};

        // Call the recursive function
        findOccurrence(str, 0, element, result);

        // Print the results
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
}