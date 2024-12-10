package Array;
//Operations :
// 1. Declare an ArrayList of different Types
// 2. Add Element
// 3. Get Element
// 4. Add Element at a specific Index
// 5. Set Element at a specific Index
// 6. Delete Element from an Index
// 7. Size of the List
// 8. Loop/Iterate on the List
// 9. Sort the List

import java.util.ArrayList;  // Importing the ArrayList class from the java.util package
import java.util.Collections;  // Importing the Collections class to sort the ArrayList

public class ArrayLists
{
    public static void main(String[] args)
    {
        // Create a new ArrayList to store Integer values
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Add elements to the ArrayList using the add() method
        list.add(0);  // Adding 0 to the list
        list.add(3);  // Adding 3 to the list
        list.add(6);  // Adding 6 to the list
        
        // Print the list after adding elements
        System.out.println("Add Elements : " + list);

        // Get an element at index 1 (second element)
        int elements = list.get(1);  // Get the element at index 1
        System.out.println("Get Element : " + elements);  // Print the retrieved element

        // Insert an element at index 1 (second position)
        list.add(1, 1);  // Inserting 1 at position 1
        System.out.println("Add element in between list : " + list);  // Print the updated list
        
        // Modify the element at index 1 (second position)
        list.set(1, 8);  // Set the value at index 1 to 8
        System.out.println("Set Element : " + list);  // Print the list after setting a new value

        // Remove the element at index 3 (fourth position)
        list.remove(3);  // Removing the element at index 3
        System.out.println("Delete Elements: " + list);  // Print the list after deletion

        // Get the size of the ArrayList
        int size = list.size();  // Getting the size of the list
        System.out.println("Size: " + size);  // Print the size of the list

        // Loop through the list using a for loop and print each element
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i));  // Print each element of the list
        }
        System.out.println();  // Add a new line after printing all elements

        // Sort the list in ascending order using Collections.sort()
        Collections.sort(list);  // Sorting the list
        System.out.println("Sorting : " + list);  // Print the sorted list
    }
}