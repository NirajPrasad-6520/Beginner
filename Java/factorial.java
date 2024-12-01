//Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:

// 4! = 4*3*2*1 = 24  
// 5! = 5*4*3*2*1 = 120  
// Here, 4! is pronounced as "4 factorial", it is also called "4 bang" or "4 shriek".

// The factorial is normally used in Combinations and Permutations (mathematics).

import java.util.Scanner;

public class factorial 
{
    public static void main(String[]args)
    {
        int n, fact = 1;
        System.out.println("Enter any number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
        sc.close();
    }
}
