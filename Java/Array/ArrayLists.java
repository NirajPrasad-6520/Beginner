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

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(0);
        list.add(3);
        list.add(6);
        
        System.out.println("Add Elements : " + list);

        //get elements
        int elements = list.get(1);
        System.out.println("Get Element : " + elements);

        //add el in btw 
        list.add(1, 1);
        System.out.println("Add element in between list : " + list);
        
        //set element
        list.set(1, 8);
        System.out.println("Set Element : " + list);

        //delete element
        list.remove(3);
        System.out.println("Delete Elements: " + list);

        //size
        int size = list.size();
        System.out.println("Size: " + size);

        //loops
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting 
        Collections.sort(list);
        System.out.println("Sorting : " + list);
    }   
}