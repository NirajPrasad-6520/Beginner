package Recursion;
// Print keypad combinations using recursion
public class Recursion15 {
    // Keypad mapping for digits 0-9
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    // Recursive method to print all combinations
    public static void printCombinations(String input, int index, StringBuilder combination)
    {
        // Base case: When all digits are processed
        if (index == input.length())
        {
            System.out.println(combination.toString());
            return;
        }

        // Get the current digit and corresponding mapping
        char currChar = input.charAt(index);
        if (currChar < '0' || currChar > '9')
        {
            System.out.println("Invalid input: only digits are allowed.");
            return;
        }

        String mapping = keypad[currChar - '0'];

        // Recursive calls for each character in the mapping
        for (int i = 0; i < mapping.length(); i++)
        {
            combination.append(mapping.charAt(i)); // Add the current character
            printCombinations(input, index + 1, combination);
            combination.deleteCharAt(combination.length() - 1); // Backtrack
        }
    }
    public static void main(String[] args)
    {
        String input = "23"; // Input string (digits only)
        printCombinations(input, 0, new StringBuilder());
    }
}