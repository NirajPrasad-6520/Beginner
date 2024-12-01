//Prime number is a number that is greater than 1 and divided by 1 or itself only.In other words,prime numbers can't be divided by other numbers than itself or 1.
// For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

// Note: 0 and 1 are not prime numbers. The 2 is the only even prime number because all the other even numbers can be divided by 2.

import java.util.*;
public class primenumber 
{
    public static void main(String[] args) 
    {
    //individual number to check Prime or Not
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any individual number to check Prime or Not :");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.println("Prime number.");
        }
        else{
            System.out.println("Not Prime Number.");
        }
        System.out.println();

    // number to check all prime number between 0 to n
        int a, count1, j, m, total = 0;
        Scanner scc=new Scanner(System.in);
        System.out.print("Enter any n number to check all prime number between 0 to n: ");
        m = scc.nextInt();
        
        for(a = 1; a <= m; a++)
        {
            count1 = 0;
            for(j = 1; j <= a; j++)
            {
                if(a % j == 0)
                {
                    count1++;
                }
            }
            if(count1  == 2)
                {
                    System.out.print(a + " ");
                    total = total + 1;// count total Prime number between 1 to n numbers 
                }
        }
        System.out.println();
        System.out.println("Total Prime Number : " + total);
    }
    
}
