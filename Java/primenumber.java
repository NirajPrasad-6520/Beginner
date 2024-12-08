//Prime number is a number that is greater than 1 and divided by 1 or itself only.In other words,prime numbers can't be divided by other numbers than itself or 1.
// For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

// Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.

import java.util.*;
public class PrimeNumber
{
    public static void main(String[] args)
    {
        // Part 1: Check if an individual number is prime
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any individual number to check Prime or Not :");
        n = sc.nextInt();

        // Loop to count the divisors of the input number
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                count++;
            }
        }

        // If divisor count is exactly 2, the number is prime
        if (count == 2)
            System.out.println("Prime number.");
        else
            System.out.println("Not Prime Number.");

        System.out.println();

        // Part 2: Find all prime numbers between 0 and a given number
        int a, count1, j, m, total = 0;
        Scanner scc = new Scanner(System.in);
        System.out.print("Enter any n number to check all prime number between 0 to n: ");
        m = scc.nextInt();

        // Outer loop: Iterate through all numbers from 1 to `m`
        for (a = 1; a <= m; a++)
        {
            count1 = 0; // Reset divisor count for each number `a`
            
            // Inner loop: Count divisors of the current number `a`
            for (j = 1; j <= a; j++)
            {
                if (a % j == 0)// Check if `j` divides `a` evenly
                {
                    count1++;
                }
            }

            // If divisor count is exactly 2, `a` is prime
            if (count1 == 2)
            {
                System.out.print(a + " ");
                total = total + 1; // Increment the total count of prime numbers
            }
        }

        System.out.println();

        System.out.println("Total Prime Number : " + total);
    }
}