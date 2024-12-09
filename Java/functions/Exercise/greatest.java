package functions.Exercise;
//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class greatest
{
    public static void printGreatest(int a, int b)
    {
        if(a > b)
        System.out.println("a is greater than b.");
        else
        System.out.println("b is greater than a.");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        printGreatest(a, b);
        sc.close();
    }
}