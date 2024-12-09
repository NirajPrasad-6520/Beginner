package String;

public class StringBuilders
{
    public static void main(String args[])
    {
        // StringBuilder append() method
        System.out.println("StringBuilder append() method :");
        // Creates a StringBuilder object with the string "Hello"
        StringBuilder sb = new StringBuilder("Hello ");
        // Appends "Java" to the existing string
        sb.append("Java"); // Original string is modified
        System.out.println(sb); // Outputs: Hello Java
        System.out.println();

        // StringBuilder insert() method
        System.out.println("StringBuilder insert() method :");
        // Creates a StringBuilder object with the string "Hello"
        StringBuilder sb1 = new StringBuilder("Hello ");
        // Inserts "Java" at index 1 (after the first character)
        sb1.insert(1, "Java"); // Original string is modified
        System.out.println(sb1); // Outputs: HJavaello
        System.out.println();

        // StringBuilder replace() method
        System.out.println("StringBuilder replace() method :");
        // Creates a StringBuilder object with the string "Hello"
        StringBuilder sb2 = new StringBuilder("Hello");
        // Replaces characters from index 1 to 3 with "Java"
        sb2.replace(1, 3, "Java");
        System.out.println(sb2); // Outputs: HJavalo
        System.out.println();

        // StringBuilder delete() method
        System.out.println("StringBuilder delete() method :");
        // Creates a StringBuilder object with the string "Hello"
        StringBuilder sb3 = new StringBuilder("Hello");
        // Deletes characters from index 1 to 3 (exclusive)
        sb3.delete(1, 3);
        System.out.println(sb3); // Outputs: Hlo
        System.out.println();

        // StringBuilder reverse() method
        System.out.println("StringBuilder reverse() method :");
        // Creates a StringBuilder object with the string "Hello"
        StringBuilder sb4 = new StringBuilder("Hello");
        // Reverses the string
        sb4.reverse();
        System.out.println(sb4); // Outputs: olleH
        System.out.println();

        // StringBuilder capacity() method
        System.out.println("StringBuilder capacity() method :");
        // Creates an empty StringBuilder object with a default capacity of 16
        StringBuilder sb5 = new StringBuilder();
        System.out.println(sb5.capacity()); // Outputs: 16 (default capacity)

        // Appends "Hello" to the StringBuilder
        sb5.append("Hello");
        System.out.println(sb5.capacity()); // Still 16 as "Hello" fits within default capacity

        // Appends a longer string to exceed the default capacity
        sb5.append("Java is my favourite language");
        // Capacity is expanded using the formula: (old capacity * 2) + 2
        System.out.println(sb5.capacity()); // Outputs: 34
    }
}