package String.Exercise;

// Java program to reverse a string without using the reverse function
import java.util.*;

public class WithoutReverseFunction
{
    public static void main(String args[])
    {
        System.out.println("Using For loop:");
        
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        s = sc.nextLine();
        
        // Print message before displaying the reversed string
        System.out.print("After reverse string is: ");
        
        // Loop to iterate through the string from the end to the beginning
        for(int i = s.length(); i > 0; --i)
        {
            System.out.print(s.charAt(i-1)); // Print characters in reverse order
        }
        System.out.println("\n");

        // Using while loop
        System.out.println("Using while loop:");
        
        // Declare another string variable
        String s1;
        Scanner scc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        s1 = sc.nextLine();
        
        // Print message before displaying the reversed string
        System.out.print("After reverse string is: ");
        
        // Initialize a counter variable with the length of the string
        int i = s1.length();
        
        // Loop to iterate through the string in reverse order
        while(i > 0)
        {
            System.out.print(s1.charAt(i-1)); // Print each character in reverse order
            i--; // Decrement the counter
        }
        sc.close();
        scc.close();
    }
}