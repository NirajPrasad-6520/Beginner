package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class Queues
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<>();
        
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        // print the queue
        System.out.println("Queue : " + queue);

        // remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Remove elements : " + front);

        // print the updated queue
        System.out.println("Queue after removal : " + queue);

        // add another element to the queue
        queue.add("date");
        queue.add("mango");

        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element : " + peeked);

        // print the updated queue
        System.out.println("Queue after peek : " + queue);

        // Rest all methods of collection
        // interface like size and contains
        // can be used with this
        // implementation.
        int size = queue.size();
        System.out.println("Size of queue-" + size);
    }
}