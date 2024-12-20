package Practice;
import java.util.Arrays;
class Node{
    int data;
    Node left,right;
    public Node(int item)
    {
        data = item;
        left= right=null;
    }
}
public class practice1
{
    public static int height(Node root){
        if(root == null)
        {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);
        root.left.left.left = new Node(6);

        int x = height(root);
        System.out.println(x);
    }
}