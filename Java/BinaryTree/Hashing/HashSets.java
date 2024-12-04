package BinaryTree.Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class HashSets
{
    public static void main(String[] args)
    {
    //Creating
    HashSet<Integer> set = new HashSet<>();
    //insert
    set.add(1);
    set.add(3);
    set.add(5);

    //Size
    System.out.println("size of set is : " + set.size());

    //Print all elements
    System.out.println(set);
    System.out.println();

    //Iterate
    System.out.println("Iterator : ");
    @SuppressWarnings("rawtypes")
    Iterator it = set.iterator();

    while(it.hasNext())
    {
        System.out.println(it.next());
    }
    System.out.println();

    //search - contains
    if(set.contains(1))
    {
        System.out.println("Search : " + "set contains 1");
    }
    if(!set.contains(6))
    {
        System.out.println("Search : " +"does not contains");
    }

    //Delete
    set.remove(1);
    if(!set.contains(1))
    {
        System.out.println("Delete : " + "does not contain 1");
    }
    }
}