package Recursion;
// Move all 'x' to the end of the string using recursion
public class Recursion11
{
    // Recursive method to move all 'x' to the end
    public static void moveAllX(String str, int index, int count, StringBuilder result) {
        // Base case: When the entire string has been processed
        if (index == str.length())
        {
            // Append all remaining 'x' at the end
            for (int i = 0; i < count; i++)
            {
                result.append('x');
            }
            System.out.println(result.toString());
            return;
        }
        // Current character
        char currChar = str.charAt(index);

        // Check if the character is 'x'
        if (currChar == 'x')
        {
            count++; // Increment count of 'x'
        }
        else
        {
            result.append(currChar); // Add non-'x' characters to the result
        }

        // Recursive call for the next character
        moveAllX(str, index + 1, count, result);
    }
    public static void main(String[] args)
    {
        String str = "axbcxxd"; // Input string
        moveAllX(str, 0, 0, new StringBuilder()); // Start the recursive process
    }
}