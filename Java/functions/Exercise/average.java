package functions.Exercise;
// Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class average
{
    public static void printAverage(int a, int b, int c)
    {
        int avg = (a + b + c) / 3;
        System.out.println("Average of a, b, c : " + avg);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        int a = sc.nextInt();

        System.out.print("b : ");
        int b = sc.nextInt();
        
        System.out.print("c : ");
        int c = sc.nextInt();
        
        printAverage(a, b, c);
        sc.close();
    }
}