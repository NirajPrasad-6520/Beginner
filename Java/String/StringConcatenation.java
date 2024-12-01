package String;

public class StringConcatenation 
{
    public static void main(String args[])
    {  
    //String Concatenation by + (String concatenation) operator
        System.out.println("String Concatenation by + (String concatenation) operator :");
        String s="Sachin"+" Tendulkar";  
        System.out.println(s);
        
    //String Concatenation by concat() method
        System.out.println("String Concatenation by concat() method :");
        String s1="Sachin ";  
        String s2="Tendulkar";  
        String s3=s1.concat(s2);  
        System.out.println(s3);

    //String concatenation using StringBuilder class
        System.out.println("String concatenation using StringBuilder class :");
        StringBuilder s11 = new StringBuilder("Hello");    //String 1  
        StringBuilder s12 = new StringBuilder(" World");    //String 2  
        StringBuilder ss = s11.append(s12);   //String 3 to store the result  
        System.out.println(ss.toString()); 
    }
}