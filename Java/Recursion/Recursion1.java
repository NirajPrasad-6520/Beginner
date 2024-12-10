package Recursion;
public class Recursion1
{
    // Method to print numbers from n down to 1 using recursion
    public static void printnumber(int n)
    {
        // Base case: if n is 0, stop the recursion
        if(n == 0)
        {
            return;  // Exit condition for the recursion to prevent infinite calls
        }
        // Print the current value of n
        System.out.println(n);

        // Recursive call: print the next number by reducing n by 1
        printnumber(n - 1);
    }
    public static void main(String[] args)
    {
        int n = 5;
        printnumber(n);  // Call printnumber method to start printing numbers from 5 to 1
    }
}