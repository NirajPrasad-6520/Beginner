package functions.Exercise;
//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;

public class SumOdd
{
    public static void printSumOfOdd(int n)
    {
    //print all odd number btw 1 to n.
        for(int i = 1; i <= n; i=i+2)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        //sum of all odd number from 1 to n.
        int sum = 0;
        for(int j = 1; j <= n; j++ )
        {
            if( (j % 2) != 0)
            {
                sum = sum + j;
            }
        }
        System.out.print("Sum of all Odd number between 1 to " + n + " is " + sum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to sum of all odd numbers from 1 to n : ");
        int n = sc.nextInt();
        printSumOfOdd(n);
        sc.close();
    }
}