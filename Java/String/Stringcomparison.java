package String;

public class Stringcomparison
{
    public static void main(String args[])
    {
        // By Using equals() Method
        System.out.println("By Using equals() Method :");
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        String s4 = "Saurav";
        // Compares the content of strings
        System.out.println(s1.equals(s2)); // true, because content is the same
        System.out.println(s1.equals(s3)); // true, because content is the same
        System.out.println(s1.equals(s4)); // false, because content is different
        
        // equalsIgnoreCase() Method
        System.out.println("equalsIgnoreCase :");
        String s5 = "SACHIN";
        // Case-sensitive comparison
        System.out.println(s1.equals(s5)); // false, because cases are different
        // Case-insensitive comparison
        System.out.println(s1.equalsIgnoreCase(s5)); // true, because content matches ignoring case

        // By Using == Operator
        System.out.println("By Using == operator :");
        // Compares references (memory locations)
        System.out.println(s1 == s2); // true, both refer to the same string instance in the string pool
        System.out.println(s1 == s3); // false, s3 is a new object created in heap memory

        // String compare by compareTo() Method
        System.out.println("String compare by compareTo() method :");
        String s6 = "Ratan";
        // Compares content lexicographically
        System.out.println(s1.compareTo(s2)); // 0, because s1 equals s2
        System.out.println(s1.compareTo(s6)); // 1, because "Sachin" > "Ratan" lexicographically
        System.out.println(s6.compareTo(s1)); // -1, because "Ratan" < "Sachin" lexicographically
    }
}