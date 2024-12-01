package functions;
import java.util.*;
public class PrintTable 
{
    public static void printtable(int n)
    {
        for(int i = 1; i <= 10; i++)
        System.out.println(n + " * " + i + " = " + n*i);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for any table: ");
        int n=sc.nextInt();
        printtable(n);
        sc.close();
    }
}
