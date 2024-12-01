package String;

public class Stringcomparison 
{
    public static void main(String args[])
    {  
    //By Using equals() Method
        System.out.println("By Using equals() Method :");
        String s1="Sachin";  
        String s2="Sachin";  
        String s3=new String("Sachin");  
        String s4="Saurav";  
        System.out.println(s1.equals(s2));//true  
        System.out.println(s1.equals(s3));//true  
        System.out.println(s1.equals(s4));//false 
        
    //public boolean equalsIgnoreCase(String another)
        System.out.println("equalsIgnoreCase :");
        String s5="SACHIN";  
        System.out.println(s1.equals(s5));//false  
        System.out.println(s1.equalsIgnoreCase(s5));//true

    //By Using == operator
        System.out.println("By Using == operator :");
        System.out.println(s1==s2);//true (because both refer to same instance)  
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool) 

    // String compare by compareTo() method
        System.out.println("String compare by compareTo() method :");
        String s6="Ratan";  
        System.out.println(s1.compareTo(s2));//0  
        System.out.println(s1.compareTo(s6));//1(because s1>s3)  
        System.out.println(s6.compareTo(s1));//-1(because s3 < s1 )
      }  
}
