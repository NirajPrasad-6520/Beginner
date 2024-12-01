package String;

public class Stringoperation 
{
    public static void main(String ar[])
    {
    //String toUpperCase() and toLowerCase() method
        System.out.println("String toUpperCase() and toLowerCase() method :");
        String s="Sachin";
        System.out.println(s.toUpperCase());//SACHIN
        System.out.println(s.toLowerCase());//sachin
        System.out.println(s);//Sachin(no change in original)    

    //String trim() method
        System.out.println("String trim() method :");
        String ss="  Sachin  ";    
        System.out.println(ss);//  Sachin      
        System.out.println(ss.trim());//Sachin 

    //String startsWith() and endsWith() method
        System.out.println("String startsWith() and endsWith() method :");
        System.out.println(s.startsWith("Sa"));//true    
        System.out.println(s.endsWith("n"));//true   

    //String charAt() Method
        System.out.println("String charAt() Method :");
        System.out.println(s.charAt(0));//S
        System.out.println(s.charAt(3));//h  

    //String length() Method
        System.out.println("String length() Method :");
        System.out.println(s.length());

    //String replace() Method
        System.out.println("String replace() Method :");
        String s1="Java is a programming language. Java is a platform. Java is an Island.";      
        String replaceString=s1.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"      
        System.out.println(replaceString); 
    }    
}
