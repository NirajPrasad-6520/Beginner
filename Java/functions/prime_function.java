package functions;

import java.util.Scanner;

public class prime_function 
{
    public static void printPrime(int n)
    {
        int count = 0;
        for(int i = 1; i <= n; i++)
            if(n % i == 0)
                count++;
                
        if(count == 2)
            System.out.println("Prime number.");
        else
            System.out.println("Not Prime Number.");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check Prime or Not :");
        int n = sc.nextInt();
        printPrime(n);
        sc.close();
    }
}
