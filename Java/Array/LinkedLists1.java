package Array;
import java.util.LinkedList;
public class LinkedLists1 
{
        public static void main(String[] args) 
    {
        // Create a new linked list
        LinkedList<String> l = new LinkedList<String>();

        //adding elements to the LinkedList using add() method
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");
        l.addLast("Ten");// Add an element to the end of the linked list
        l.addFirst("Zero");//Add an element to the beginning of the linked list
        l.add(1,"A");
        
        System.out.println("Initial LinkedList : " + l +"\nThe size of the linked list is: "+ l.size());

        //Linked list to To Array by using  toArray();
        Object[] a = l.toArray();
        System.out.print("After converted LinkedList to Array: ");
        for(Object element : a)
        System.out.print(element+" ");

        System.out.println();

        //remove element
        l.set(1, "set");//After adding the elements, if we wish to change the element, it can be done using the set() method.
        l.remove(3);//by index number
        l.remove("Four");//by value
        l.removeFirst();
        l.removeLast();
        
        System.out.println("Update LinkedList : " + l);
    }
}