package Stack;
import java.util.*;
public class Stack1
{
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }

        // 1. Adding Elements:
        // Default initialization of Stack
        System.out.println("Adding Elements: push");
        Stack stack1 = new Stack();

        // Initialization of Stack
        // using Generics
        Stack<String> stack2 = new Stack<String>();

        stack1.push(4);
        stack1.push("hello");
        stack1.push("world");
        stack1.push(30);
        stack1.push(20);
        stack1.push(5);

        stack2.push("This");
        stack2.push("is");
        stack2.push("string");
        stack2.push("stack");


        System.out.println(stack1);
        System.out.println();

        //Find the size of the Stack
        System.out.println("Find the size of the Stack : ");
        int x=stack1.size();
        System.out.println("The stack size is: "+x);
        System.out.println();

        //2. Accessing the Element: To retrieve or fetch the first element of the Stack or the element present at the top of the Stack, we can use peek() method.
        // Fetching the element at the head of the Stack
        System.out.println("Accessing the Element : peek");
        System.out.println("Initial Stack: " + stack1);
        System.out.println("The element at the top of the" + " stack is: " + stack1.peek());

         // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack1);

        System.out.println(stack2);
        System.out.println();

        //3. Removing Elements: To pop an element from the stack, we can use the pop() method.
        // Displaying the Stack
        System.out.println("Removing Elements: pop");
        System.out.println("Initial Stack: " + stack1);

        // Removing elements using pop() method
        System.out.println("Popped element: "+ stack1.pop());
        System.out.println("Popped element: "+ stack1.pop());

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation "+ stack1);
    
        System.out.println("Is stack empty? " + stack1.empty()); // Should print false
        // Pop remaining elements
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack1.empty()); // Should print true
        System.out.println();
        
        // Search an element
        System.out.println("Search an element : ");
        System.out.println("Initial Stack : " + stack2);
        int location = stack2.search("string");
        System.out.println("Location of string: " + location);
        System.out.println();

        //Using the iterator() Method
        System.out.println("Using the iterator() Method :");
        //iteration over the stack
        Iterator iterator = stack2.iterator();
        while(iterator.hasNext())
        {
            Object values = iterator.next();
            System.out.println(values);
        }
    }
}