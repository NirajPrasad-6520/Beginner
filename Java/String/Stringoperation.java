package String;

public class Stringoperation
{
    public static void main(String ar[])
    {
        // String toUpperCase() and toLowerCase() method
        System.out.println("String toUpperCase() and toLowerCase() method :");
        String s = "Sachin";
        // Converts all characters in the string to uppercase
        System.out.println(s.toUpperCase()); // Outputs: SACHIN
        // Converts all characters in the string to lowercase
        System.out.println(s.toLowerCase()); // Outputs: sachin
        // Original string remains unchanged as strings are immutable in Java
        System.out.println(s); // Outputs: Sachin (no change in the original string)
        System.out.println();

        // String trim() method
        System.out.println("String trim() method :");
        String ss = "  Sachin  ";
        // Displays the string with leading and trailing spaces
        System.out.println(ss); // Outputs: "  Sachin  "
        // Removes leading and trailing spaces from the string
        System.out.println(ss.trim()); // Outputs: "Sachin"

        // String startsWith() and endsWith() method
        System.out.println("String startsWith() and endsWith() method :");
        // Checks if the string starts with "Sa"
        System.out.println(s.startsWith("Sa")); // true
        // Checks if the string ends with "n"
        System.out.println(s.endsWith("n")); // true

        // String charAt() Method
        System.out.println("String charAt() Method :");
        // Returns the character at index 0 (first character)
        System.out.println(s.charAt(0)); // Outputs: S
        // Returns the character at index 3 (fourth character)
        System.out.println(s.charAt(3)); // Outputs: h

        // String length() Method
        System.out.println("String length() Method :");
        // Returns the length of the string (number of characters)
        System.out.println(s.length()); // Outputs: 6

        // String replace() Method
        System.out.println("String replace() Method :");
        String s1 = "Java is a programming language. Java is a platform. Java is an Island.";
        // Replaces all occurrences of "Java" with "Kava"
        String replaceString = s1.replace("Java", "Kava");
        System.out.println(replaceString); // Outputs the modified string with "Java" replaced by "Kava"
    }
}