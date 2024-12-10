package Recursion;
// Remove duplicates in a string using recursion
public class Recursion12
{
    // Boolean array to track seen characters
    public static boolean[] seen = new boolean[26];

    // Recursive method to remove duplicates
    public static String removeDuplicates(String str, int index, StringBuilder result)
    {
        // Base case: End of the string
        if (index == str.length())
        {
            return result.toString();
        }
        // Current character
        char currChar = str.charAt(index);

        // Check if the character is already seen
        if (!seen[currChar - 'a'])
        {
            result.append(currChar); // Add unique character to result
            seen[currChar - 'a'] = true; // Mark the character as seen
        }

        // Recursive call for the next character
        return removeDuplicates(str, index + 1, result);
    }
    public static void main(String[] args) {
        String str = "abbccdda"; // Input string
        System.out.println(removeDuplicates(str, 0, new StringBuilder())); // Output result
    }
}