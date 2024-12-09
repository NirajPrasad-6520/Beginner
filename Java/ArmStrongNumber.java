import java.util.Scanner;

public class ArmStrongNumber
{
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number)
    {
        // Store the original number to compare later
        int originalNumber = number;
        // Variable to hold the sum of digits raised to the power of their count
        int result = 0;
        // Calculate the number of digits in the given number
        int digits = String.valueOf(number).length();

        // Loop to extract each digit and calculate its power
        while (number != 0)
        {
            // Get the last digit of the number
            int remainder = number % 10;
            // Add the digit raised to the power of the total number of digits to the result
            result += Math.pow(remainder, digits);
            // Remove the last digit from the number
            number /= 10;
        }
        // Return true if the sum equals the original number, else false
        return result == originalNumber;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the upper limit
        System.out.print("Enter the upper limit (n): ");
        int n = scanner.nextInt(); // Read the upper limit from the user

        // Print the Armstrong numbers in the range 0 to n
        System.out.println("Armstrong numbers between 0 and " + n + ":");
        for (int i = 0; i <= n; i++)
        { // Iterate through all numbers from 0 to n
            if (isArmstrong(i))// Check if the current number is an Armstrong number
            {
                System.out.print(i + " "); // Print the Armstrong number
            }
        }
        scanner.close(); // Close the scanner to free up resources
    }
}