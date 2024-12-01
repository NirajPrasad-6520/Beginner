//Palindrome number in java: A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. It can also be a string like LOL, MADAM etc.

import java.util.*;
public class palindrome 
{
    public static void main(String[]args)
    {
    //Palindrome Number
        int n, c, r, s = 0;
        System.out.println("Enter any number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = n;

        while(n > 0)
        {
            r = n % 10;//last digit
            s = (s * 10) + r;
            n = n / 10;
        }

        if(c == s)
        System.out.println(c + " is Palindrome Number");
        else
        System.out.println(c + " is Not Palindrome Number beacuse it's reverse is " + s);
        System.out.println();

    //Palindrome Words
        System.out.println("Enter Word");
        String str = sc.next();
        String rev = "";

        for(int i = 0; i < str.length(); i++)
        rev = str.charAt(i) + rev;
        
        if(str.equalsIgnoreCase(rev))
        System.out.println(str + " is Palindrome Word");
        else
        System.out.println(str + " is Not Palindrome Word because it's reverse is " + rev);   
        sc.close();     
    }
}
