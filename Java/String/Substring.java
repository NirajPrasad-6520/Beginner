package String;

import java.util.*;
public class Substring
{
    public static void main(String args[])
    {
        // substring() method
        System.out.println("substring() method :");
        // Original string
        String s = "SachinTendulkar";
        System.out.println("Original String: " + s);
        // Extracts substring starting from index 6 to the end of the string
        System.out.println("Substring starting from index 6: " + s.substring(6)); // Outputs: Tendulkar
        // Extracts substring from index 0 (inclusive) to index 6 (exclusive)
        System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 6)); // Outputs: Sachin
        System.out.println(); // Adds an empty line for readability

        // Using String.split() method
        System.out.println("Using String.split() method:");
        // String to be split
        String text = new String("Hello, My name is Niraj");
        /* Splits the string using the delimiter `\\.` (period).
           Since there is no period in the string, the entire string will be treated as one segment. */
        String[] sentences = text.split("\\.");
        // Prints the resulting array
        System.out.println(Arrays.toString(sentences)); // Outputs the entire string in an array
    }
}