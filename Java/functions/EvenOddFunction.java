package functions;
import java.util.*;
public class EvenOddFunction 
{
    public static void printEvenOdd(int n)
    {
        if(n % 2 ==0)
        System.out.println("Even");
        else
        System.out.println("Odd");
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nubmer to check even or odd : ");
        int n=sc.nextInt();
        printEvenOdd(n);
        sc.close();
    }
}
