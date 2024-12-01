package String.Exercise;
//How to reserve a string in Java without using reverse function
import java.util.*;
public class WithoutReverseFunction 
{
    public static void main(String args[])
    {
    //Using For loop
        System.out.println("Using For loop :");
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        s = sc.nextLine();
        System.out.print("After reverse string is: ");  
        for(int i = s.length(); i > 0; --i)                //i is the length of the string
        {  
            System.out.print(s.charAt(i-1)); 
        }
        System.out.println("\n");

    //Using while loop
        System.out.println("Using while loop : ");
                String s1;
                Scanner scc = new Scanner(System.in);
                System.out.print("Enter a String: ");
                s1=sc.nextLine();
                System.out.print("After reverse string is: ");  
                int i = s1.length();
                while(i > 0)
                {  
                    System.out.print(s1.charAt(i-1));
                    i--;
                }  
                sc.close();
                scc.close();
    }      
}
