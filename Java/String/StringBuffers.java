package String;

public class StringBuffers
{
    public static void main(String[] args)
    {
        // StringBuffer Class append() Method
        System.out.println("StringBuffer Class append() Method :");
        // Creates a StringBuffer object with the string "Hello"
        StringBuffer sb = new StringBuffer("Hello ");
        // Appends "Java" to the existing string
        sb.append("Java"); // Now the original string is changed
        System.out.println(sb); // Outputs: Hello Java
        System.out.println();

        // StringBuffer insert() Method
        System.out.println("StringBuffer insert() Method :");
        // Creates a StringBuffer object with the string "Hello"
        StringBuffer sb1 = new StringBuffer("Hello");
        // Inserts "Java" at index 1 (after the first character)
        sb1.insert(1, "Java"); // Now the original string is changed
        System.out.println(sb1); // Outputs: HJavaello
        System.out.println();

        // StringBuffer replace() Method
        System.out.println("StringBuffer replace() Method :");
        // Creates a StringBuffer object with the string "Hello"
        StringBuffer sb2 = new StringBuffer("Hello");
        // Replaces the characters between index 1 and 3 with "Java"
        sb2.replace(1, 3, "Java");
        System.out.println(sb2); // Outputs: HJavalo
        System.out.println();

        // StringBuffer delete() Method
        System.out.println("StringBuffer delete() Method :");
        // Creates a StringBuffer object with the string "Hello "
        StringBuffer sb3 = new StringBuffer("Hello ");
        // Deletes characters from index 1 to 3 (exclusive)
        sb3.delete(1, 3);
        System.out.println(sb3); // Outputs: Hlo
        System.out.println();

        // StringBuffer reverse() Method
        System.out.println("StringBuffer reverse() Method :");
        // Creates a StringBuffer object with the string "Hello"
        StringBuffer sb4 = new StringBuffer("Hello");
        // Reverses the string
        sb4.reverse();
        System.out.println(sb4); // Outputs: olleH
        System.out.println();

        // StringBuffer capacity() Method
        System.out.println("StringBuffer capacity() Method :");
        // Creates an empty StringBuffer object with a default capacity of 16
        StringBuffer sbb = new StringBuffer();
        System.out.println(sbb.capacity()); // Outputs: 16 (default capacity)
        sbb.append("Hello");
        System.out.println(sbb.capacity()); // Still 16 as "Hello" fits within the default capacity
        // Appends a long string to exceed the initial capacity
        sbb.append("Java is my favourite language");
        // Capacity is expanded using the formula: (old capacity * 2) + 2
        System.out.println(sbb.capacity()); // Outputs: 34
        System.out.println();
    }
}