package Recursion;
//Print x^n (stack height = logn).
public class Recursion7 
{
    public static int calcpower(int x, int n) 
    {
        if (n == 0) //base case 1
        {
            return 1;
        } 
        if (n == 0) //base case 2
        {
            return 0;
        } 
        //if n is even 
        if(n % 2 == 0)
        {
            return calcpower(x, n/2) * calcpower(x, n/2);
        }
        else //n is odd
        {
            return calcpower(x, n/2) * calcpower(x, n/2) * x;
        }
    }
    public static void main(String[] args) 
    {
        int x = 2, n = 5;
        int result = calcpower(x, n);
        System.out.println(result); 
    }
}