package Practice;

import java.util.Scanner;

public class practice1
{
    public static void main(String[] args)
    {
        System.out.println("my first practice program.");
        
        int n = 10,i,j,count,total = 0;
        for(i = 1; i <= n; i++)
        {
            count = 0;
            for(j = 1; j <= i; j++)
            {
                if(i % j == 0)
                count++;
            }
            if(count == 2)
            {
                System.out.print(i + " ");
                total = total + 1;
            }
        }
        System.out.println();
        System.out.println("Total " + total);
    }
}