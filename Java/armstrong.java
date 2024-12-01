//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits. It is also known as pluperfect, or Plus Perfect, or Narcissistic number.

import java.util.*;
public class armstrong {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

    //Upto 3-digits number of Armstrong number
        System.out.println("Enter number upto 3digits numbers:");
        
        int n, c, r, arm = 0;
        n = sc.nextInt();
        c = n;

        while(n > 0)
        {
            r = n % 10;
            arm = (r * r * r) + arm;
            n = n / 10;
        }

        if(c == arm)
        System.out.println(c + " is Armstrong number.");
        else
        System.out.println(c + " is not Armstrong number.");
        System.out.println();

    //All types of Armstrong numbers:
        System.out.println("Enter all types of Armstrong numbers:");
        int m = sc.nextInt();
        int t1 = m, leng = 0;

        while(t1 != 0)
        {
            leng = leng + 1;
            t1 = t1 / 10;
        }

        int t2 = m, arm1 = 0, rem;
        while(t2 != 0)
        {
            int mul = 1;
            rem = t2 % 10;

            for(int i = 1; i <= leng; i++)
            {
                mul = mul * rem;
            }
            arm1 = arm1 + mul;
            t2 = t2 / 10;
        }     

        if(arm1 == m)
            System.out.println(m + " is Armstrong number.");
        else
        System.out.println(m + " is not Armstrong number.");

        sc.close();
    }
}
