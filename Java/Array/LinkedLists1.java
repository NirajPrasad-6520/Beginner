package Array;

import java.util.LinkedList;
public class LinkedLists1
{
    public static void main(String[] args)
    {
        LinkedList<String> l = new LinkedList<String>();

        // Adding elements to the LinkedList using add() method
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");
        l.addLast("Ten");
        l.addFirst("Zero");
        l.add(1, "A");

        // Display the initial LinkedList and its size
        System.out.println("Initial LinkedList : " + l + "\nThe size of the linked list is: " + l.size());

        // Convert LinkedList to an Array using toArray() method
        Object[] a = l.toArray(); // Convert the LinkedList to an array
        System.out.print("After converted LinkedList to Array: ");
        for(Object element : a)
        {
            // Iterate through the array and print its elements
            System.out.print(element + " ");
        }
        System.out.println();

        // Modifying and removing elements in the LinkedList
        l.set(1, "set"); // Updates the element at index 1 to "set"
        l.remove(3);  // Removes the element at index 3
        l.remove("Four");// Removes the first occurrence of the element "Four"
        l.removeFirst();  // Removes the first element of the LinkedList
        l.removeLast();  // Removes the last element of the LinkedList

        System.out.println("Updated LinkedList : " + l);
    }
}