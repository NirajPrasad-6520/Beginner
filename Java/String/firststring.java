package String;
import java.util.*;
public class firststring 
{
        public static void main(String args[]) 
        {
                 Scanner sc = new Scanner (System.in);
                 System.out.println("Enter number to how many name user want:");
                 int size = sc.nextInt();
                 String array[] = new String[size];
                 int totLength = 0;
            
                 for(int i=0; i<size; i++) 
                 {
                  System.out.println("Enter name:");
                   array[i] = sc.next();
                   totLength += array[i].length();
                 }
                 System.out.println(totLength);
                 sc.close();
        }
}