package Array;
class Node
{
    int data;    // Data stored in the node
    Node next;   // Reference to the next node in the list

    // Constructor to create a new node with given data
    Node(int data)
    {
        this.data = data;
        this.next = null; // Initially, the next pointer is null
    }
}
// Class to represent the LinkedList
class LL
{
    Node head; // Head of the LinkedList

    // Method to add a node at the end of the list
    public void addLast(int data)
    {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) // If the list is empty
        {
            head = newNode;// Set the new node as the head
            return;
        }
        Node temp = head;// Start from the head
        while (temp.next != null) // Traverse to the last node
        {
            temp = temp.next;
        }
        temp.next = newNode;  // Link the last node to the new node
    }
    // Method to print the linked list
    public void printList()
    {
        if (head == null)// If the list is empty
        {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head; // Start from the head
        while (temp != null)// Traverse until the end of the list
        {
            System.out.print(temp.data + " -> "); // Print the data
            temp = temp.next;// Move to the next node
        }
        System.out.println("null");// Indicate the end of the list
    }

    // Method to reverse the linked list iteratively
    public void reverseIterate()
    {
        if (head == null || head.next == null)// If the list has 0 or 1 node, no need to reverse
        {
            return;
        }

        Node prevNode = null;     // Previous node starts as null
        Node currNode = head;    // Current node starts as the head
        while (currNode != null)// Traverse the list
        {
            Node nextNode = currNode.next;// Save the next node
            currNode.next = prevNode;    // Reverse the current node's link
            prevNode = currNode;        // Move prevNode one step ahead
            currNode = nextNode;       // Move currNode one step ahead
        }
        head = prevNode;// Update the head to the new first node
    }
}
// Main class to demonstrate the LinkedList operations
public class ReverseLinkedLists
{
    public static void main(String[] args)
    {
        LL list = new LL(); // Create a new LinkedList
        list.addLast(1);    // Add nodes to the list
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println("Original List:");
        list.printList();   // Print the original list

        list.reverseIterate(); // Reverse the list iteratively

        System.out.println("Reversed List:");
        list.printList();   // Print the reversed list
    }
}