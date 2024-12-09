package String.Exercise;

public class CountVowelConsonant
{
    public static void main(String[] args)
    {
        // Variables to count vowels and consonants
        int vCount = 0, cCount = 0;
        // Input string to be processed
        String str = "This is a really simple sentence";

        // Convert the entire string to lowercase to simplify comparison
        str = str.toLowerCase();
        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++)
        {
            // Check if the character is a vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                System.out.print(str.charAt(i) + " "); // Print the vowel character
                vCount++; // Increment the vowel count
            }
            // Check if the character is a consonant (any letter that is not a vowel)
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                cCount++; // Increment the consonant count
            }
        }
        System.out.println();

        // Print the total number of vowels
        System.out.println("Number of vowels: " + vCount);

        // Print the total number of consonants
        System.out.println("Number of consonants: " + cCount);
    }
}