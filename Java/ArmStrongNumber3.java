import java.util.Scanner;

public class ArmStrongNumber3
{
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number)
    {
        int originalNumber = number; // Store the original number
        int result = 0; // To hold the sum of the digits raised to the power of the number of digits
        int digits = String.valueOf(number).length(); // Calculate the number of digits

        // Process each digit of the number
        while (number != 0)
        {
            int remainder = number % 10; // Extract the last digit
            result += Math.pow(remainder, digits); // Raise the digit to the power and add to the result
            number /= 10; // Remove the last digit
        }

        return result == originalNumber; // Compare the sum with the original number
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();

        // Check and display if the number is an Armstrong number
        if (isArmstrong(number))
        {
            System.out.println(number + " is an Armstrong number.");
        }
        else
        {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close(); // Close the scanner to release resources
    }
}