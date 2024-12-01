package String.Exercise;
// Java Program to swap two string variables without using third or temp variable.
public class SwapString 
{
    public static void main(String[] args) {    
        String str1 = "Good ", str2 = "morning ";    
        System.out.println("Strings before swapping: " + str1 + " " + str2);    
            
        str1 = str1 + str2;    
        //Extract str2 from updated str1    
        str2 = str1.substring(0, (str1.length() - str2.length()));    
        //Extract str1 from updated str1    
        str1 = str1.substring(str2.length());    
            
        System.out.println("Strings after swapping: " + str1 + " " + str2);    
    }    
}