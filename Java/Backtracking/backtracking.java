package Backtracking;

public class backtracking
{
    // Method to generate and print all permutations of a given string
    public static void printpermutation(String str, String perm, int idx)
    {
        // Base case: If the input string is empty, a complete permutation has been formed
        if(str.length() == 0)
        {
            System.out.println(perm); // Print the generated permutation
            return; // Return to explore other permutations
        }

        // Recursive case: Iterate through each character of the string
        for(int i = 0; i < str.length(); i++)
        {
            char currChar = str.charAt(i); // Current character to include in the permutation
            // Create a new string by excluding the current character
            String newString = str.substring(0, i) + str.substring(i + 1);
            // Recursive call with the updated string and the current permutation
            printpermutation(newString, perm + currChar, idx + 1);
        }
    }
    // Main method to test the backtracking algorithm
    public static void main(String[] args)
    {
        String str = "ABC"; // Input string for which permutations are generated
        printpermutation(str, "", 0); // Initial call to the recursive method
    }
}