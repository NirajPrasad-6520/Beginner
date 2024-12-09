package String.Exercise;
// Java Program to swap two string variables without using third or temp variable.
public class SwapString
{
    public static void main(String[] args)
    {
        String str1 = "Good ", str2 = "morning ";

        System.out.println("Strings before swapping: " + str1 + " " + str2);
            
        // Step 1: Concatenate str1 and str2 to form a combined string
        str1 = str1 + str2;
        
        // Step 2: Extract the original str2 (which is now at the beginning of the combined string)
        // Use substring to extract the first part of str1 up to the length of the original str2
        str2 = str1.substring(0, (str1.length() - str2.length()));
        
        // Step 3: Extract the original str1 (which is now at the end of the combined string)
        // Use substring to extract the remaining part of str1 after the original str2
        str1 = str1.substring(str2.length());

        System.out.println("Strings after swapping: " + str1 + " " + str2);
    }
}