package String.Exercise;

public class CountCharacter
{
    public static void main(String[] args)
    {
        // Input string
        String s = "An object that represents a number of character values";
        int count = 0; // Counter to count non-space characters

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++)
        {
            // If the current character is not a space, increment the count
            if (s.charAt(i) != ' ')
            {
                count++;
            }
        }

        // Removes all spaces from the string using regex
        s = s.replaceAll("\\s+", "");
        System.out.println("String after removing spaces : " + s);  // Outputs the string without spaces
        System.out.println("Number of non-space characters: " + count); // Outputs the count of non-space characters

        // Another input string
        String ss = "An object that represents a number of character values";
                    
        // Replace all spaces with a specific character ('-')
        ss = ss.replace(' ', '-');
        System.out.println("String after replacing spaces with given character: " + ss); // Outputs the string with spaces replaced by '-'
    }
}