package Recursion;
// Program to calculate and print the sum of the first 'n' natural numbers using recursion.
public class Recursion3
{
    // A recursive method to calculate and print the sum of the first 'n' natural numbers.
    public static void printSum(int i, int n, int sum)
    {
        // Base case: When 'i' reaches 'n', add 'i' to 'sum', print the result, and exit recursion.
        if (i == n)
        {
            sum += i; // Add the final number to the sum.
            System.out.println("Sum : " + sum); // Print the total sum.
            return; // End the recursive calls.
        }
        // Accumulate the sum.
        sum += i;

        // Recursive call: Increment 'i' and continue adding numbers.
        printSum(i + 1, n, sum);

        // This statement executes during the backtracking phase of recursion.
        System.out.println("index : " + i);
    }
    public static void main(String[] args)
    {
        printSum(1, 5, 0); // Start the recursive process with i=1, n=5, sum=0.
    }
}