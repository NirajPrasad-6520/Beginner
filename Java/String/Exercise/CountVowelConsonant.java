package String.Exercise;

public class CountVowelConsonant
{
    public static void main(String[] args)
    { // Variables to count vowels, consonants, and characters excluding spaces
        int vCount = 0, cCount = 0, count = 0;

        // Input string to be processed
        String str = "This is a really simple sentence";

        // Convert the entire string to lowercase to simplify comparison
        str = str.toLowerCase();

        System.out.print("All Vowels : ");
        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Skip spaces
            if (ch == ' ') {
                continue;
            }

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch + " "); // Print the vowel character
                vCount++; // Increment the vowel count
            }
            // Check if the character is a consonant
            else if (ch >= 'a' && ch <= 'z') {
                cCount++; // Increment the consonant count
            }

            // Increment count for every non-space character
            count++;
        }
        System.out.println();

        // Print the total number of vowels
        System.out.println("Number of vowels: " + vCount);

        // Print the total number of consonants
        System.out.println("Number of consonants: " + cCount);

        // Print the total number of characters excluding spaces
        System.out.println("Total characters (excluding spaces): " + count);
    }
}