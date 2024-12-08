//Palindrome number in java: A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc.
    import java.util.Scanner;
    public class PalindromeCheck
    {
        public static void main(String[] args)
        {
            //Palindrome Number
            // Variables for the palindrome number logic
            int n, c, r, s = 0;

            System.out.println("Enter any number :");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            c = n; // Store the original number for later comparison
    
            // Reverse the number using a while loop
            while (n > 0)
            {
                r = n % 10; // Extract the last digit
                s = (s * 10) + r; // Build the reversed number
                n = n / 10; // Remove the last digit from the number
            }
    
            if (c == s)
                System.out.println(c + " is Palindrome Number");
            else
                System.out.println(c + " is Not Palindrome Number because it's reverse is " + s);

            System.out.println();
    
            //Palindrome Word
            System.out.println("Enter Word");
            String str = sc.next();
            String rev = ""; // Initialize an empty string to store the reversed word
    
            // Reverse the word using a for loop
            for (int i = 0; i < str.length(); i++)
            {
                rev = str.charAt(i) + rev; // Prepend each character to the reverse string
            }
    
            // Check if the original word is equal to its reverse (case-insensitive)
            if (str.equalsIgnoreCase(rev))
                System.out.println(str + " is Palindrome Word");
            else
                System.out.println(str + " is Not Palindrome Word because it's reverse is " + rev);
    
            sc.close();
        }
    }