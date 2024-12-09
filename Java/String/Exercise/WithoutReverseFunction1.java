package String.Exercise;
// Java program to reverse a string without using the reverse function
import java.util.*;
public class WithoutReverseFunction1
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        // Call the static reverse() method and print the reversed string
        System.out.println("Reverse String is: " + WithoutReverseFunction1.reverse(s));

        sc.close();
    }
    static String reverse(String str)
    {
        // Initialize an empty string to store the reversed result
        String rev = "";

        // Loop to iterate through the string from the last character to the first character
        for (int i = str.length(); i > 0; --i)
        {
            // Append each character to the result string in reverse order
            rev = rev + str.charAt(i - 1);
        }
        return rev;
    }
}