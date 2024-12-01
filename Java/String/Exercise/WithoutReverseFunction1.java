package String.Exercise;
//How to reserve a string in Java without using reverse function
import java.util.*;
public class WithoutReverseFunction1 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String  s = sc.nextLine();
        System.out.println("Reverse String  is : " + WithoutReverseFunction1.reverse(s));
        sc.close();
    }
        static String reverse(String str)
        {
            String rev =  "";  
            for(int i = str.length();i > 0; --i)  
            {  
                rev = rev + (str.charAt(i - 1));   
            }  
            return rev;  
        }      
}