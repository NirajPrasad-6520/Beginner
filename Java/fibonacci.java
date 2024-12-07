//In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.

import java.util.*;
public class fibonacci
{
    public static void main(String []args)
    {
    //nth number of fibonacci example:if n=50 so between 0 to 50 fibonacci print,n=500 so between 0 to 500 fibonacci print.
        int c = 0, a = 0, b = 1;// Initialize variables: `a` and `b` for the first two Fibonacci numbers, `c` for the next number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int  n = sc.nextInt();
        System.out.print(a + " " + b + " ");

        while(c < n)
        {
            c = a+b;// Calculate the next Fibonacci number
            if (c > n) break; // Stop if the number exceeds the limit
            System.out.print(c + " ");
            a = b;// Update `a` to the value of `b`
            b = c;// Update `b` to the value of the new Fibonacci number
        }
        System.out.println("\n");

    //Sequence fibonacci series
    //example if m=7 so only 1 to 7 index of fibonacci print
        System.out.println("Sequence fibonacci series");
        int r = 0, q = 0, s = 1;
        Scanner scc = new Scanner(System.in);
        System.out.println("Enter number");
        int m = scc.nextInt();

        for(int i = 1; i <= m; i++)
        {
            System.out.print(q +  " ");
            r = q + s;
            q = s;
            s = r;
        }
            scc.close();
            sc.close();
    }
}