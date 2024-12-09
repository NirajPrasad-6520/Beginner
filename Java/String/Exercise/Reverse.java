package String.Exercise;

public class Reverse
{
    public static void main(String[] args)
    {
        String str = "Hello World";

        // Initialize an empty string to store the reversed string
        String rev = "";
            
        // Loop through the string from the last character to the first
        for (int i = str.length() - 1; i >= 0; i--)
        {
            // Append each character from the end to the 'rev' string
            rev = rev + str.charAt(i);
        }
        System.out.println("Original string: " + str);

        System.out.println("Reverse of given string: " + rev);
    }
}