package String.Exercise;

public class IndividualCharacters
{
    public static void main(String[] args)
    {
        // Input string to be processed
        String string = "characters ";

        // Output heading to explain what is being printed
        System.out.println("Individual characters from given string: ");

        // Loop through each character in the string
        for (int i = 0; i < string.length(); i++)
        {
            // Print each character followed by a space
            System.out.print(string.charAt(i) + "  ");
        }
    }
}