package String;
import java.util.*;  
public class Substring 
{
    public static void main(String args[])
    {
    //substring() method    
        System.out.println("substring() method :");
        String s="SachinTendulkar";    
        System.out.println("Original String: " + s);  
        System.out.println("Substring starting from index 6: " +s.substring(6));//Tendulkar    
        System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6)); //Sachin  
        System.out.println();

    //Using String.split() method
        System.out.println("Using String.split() method:");
        String text= new String("Hello, My name is Niraj");  
        /* Splits the sentence by the delimeter passed as an argument */  
        String[] sentences = text.split("\\.");  
        System.out.println(Arrays.toString(sentences));  
        }
}
