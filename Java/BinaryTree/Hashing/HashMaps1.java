package BinaryTree.Hashing;

import java.util.*;
public class HashMaps1
{
    public static void main(String[] args)
    {
        //country(key),population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        //search
        if(map.containsKey("Indonesia"))
        {
            System.out.println("Key is present in the map");
        }
        else
        {
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China"));//key exists
        System.out.println(map.get("Indonesia"));

        int arr[] = {12,15,18};
        for(int i = 0; i<3; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int val : arr)
        {
            System.out.println(val + " ");
        }
        System.out.println();

        System.out.println("Entry key : ");
        for(Map.Entry<String,Integer>e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println();

        System.out.println("Set key : ");
        Set<String> keys = map.keySet();
        for(String key : keys)
        {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println();

        System.out.println("Remove : ");
        map.remove("China");
        System.out.println(map);
    }
}