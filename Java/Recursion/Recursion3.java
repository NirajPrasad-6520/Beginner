package Recursion;
//Print sum of first n natural number.
public class Recursion3 
{
    public static void printSum(int i, int n , int  sum)
    {
        if(i == n)
        {
            sum += i;
            System.out.println("Sum : " + sum);
            return;
        }
        sum += i;
        printSum(i + 1, n , sum);
        System.out.println("index : " + i);
    }
    public static void main(String[]args)
    {
        printSum(1, 5, 0);
    }    
}