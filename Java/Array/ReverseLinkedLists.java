package Array;

class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    Node head;

    // Method to add a node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to reverse the linked list iteratively
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = null;
        Node currNode = head;
        while (currNode != null) {
            Node nextNode = currNode.next; // Save the next node
            currNode.next = prevNode; // Reverse the link
            prevNode = currNode; // Move prevNode one step ahead
            currNode = nextNode; // Move currNode one step ahead
        }
        head = prevNode; // Update the head to the new first node
    }
}

public class ReverseLinkedLists {
    public static void main(String[] args) {
        LL list = new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println("Original List:");
        list.printList();

        list.reverseIterate();

        System.out.println("Reversed List:");
        list.printList();
    }
}