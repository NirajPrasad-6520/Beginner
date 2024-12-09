package String;

public class StringConcatenation
{
    public static void main(String args[])
    {
        // String Concatenation by + (String concatenation) operator
        System.out.println("String Concatenation by + (String concatenation) operator :");
        // Concatenates two strings using the `+` operator
        String s = "Sachin" + " Tendulkar"; // Combines "Sachin" and "Tendulkar"
        System.out.println(s); // Outputs: Sachin Tendulkar
        System.out.println(); // Adds an empty line for better readability

        // String Concatenation by concat() method
        System.out.println("String Concatenation by concat() method :");
        // Creates two strings and concatenates them using the `concat()` method
        String s1 = "Sachin ";  // First string
        String s2 = "Tendulkar"; // Second string
        String s3 = s1.concat(s2); // Combines s1 and s2 using concat()
        System.out.println(s3); // Outputs: Sachin Tendulkar
        System.out.println(); // Adds an empty line for better readability

        // String concatenation using StringBuilder class
        System.out.println("String concatenation using StringBuilder class :");
        // Creates two StringBuilder objects for mutable string manipulation
        StringBuilder s11 = new StringBuilder("Hello");    // StringBuilder 1 with initial value "Hello"
        StringBuilder s12 = new StringBuilder(" World");   // StringBuilder 2 with initial value " World"
        // Appends the content of s12 to s11
        StringBuilder ss = s11.append(s12);   // Appends s12 to s11, and stores the result in ss
        System.out.println(ss.toString()); // Converts StringBuilder to string and prints: Hello World
    }
}