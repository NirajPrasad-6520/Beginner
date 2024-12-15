package BinaryTree;
//Number of Nodes in the longest path between ant 2 nodes.
//Approach 2 : 0(n)
class Node
{
    int data;
    Node left , right;

    public Node(int item)
    {
        data = item ;
        left = right = null;
    }
}
public class DiameterOfTree2
{
    static class TreeInfo
    {
        int ht;
        int diam;

        TreeInfo(int ht, int diam)
        {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root)
    {
        if(root == null)
        {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }
    public static void main(String[] args)
    {
        // Create a binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(diameter2(root).diam);
    }
}