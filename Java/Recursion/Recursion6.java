package Recursion;
//Print x^n (stack height = n).
public class Recursion6 
{
        public static int power(int x, int n) 
        {
            if (n == 0) 
            {
                return 1;
            } 
            else 
            {
                return x * power(x, n - 1);
            }
        }
        public static void main(String[] args) 
        {
            int x = 2, n = 5;
            int result = power(x, n);
            System.out.println(x + "^" + n + " = " + result); 
        }
}