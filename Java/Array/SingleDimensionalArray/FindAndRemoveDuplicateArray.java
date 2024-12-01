package Array.SingleDimensionalArray;
import java.util.Arrays;
// It allows you to use the Arrays class from the java.util package without needing to specify its full name each time you reference it.
// This class contains useful methods for manipulating arrays, such as sorting and converting them to strings.
public class FindAndRemoveDuplicateArray 
{
    public static void main(String[] args) 
    {
        int[] arr = new int[]{1,2,3,6,2,3,6,9,8,7};
        System.out.println("Duplicate elementa in given array:");
        
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++)
        for(int j = i + 1; j < arr.length; j++)
        if(arr[i] == arr[j])
        System.out.print(arr[j] + " ");
        System.out.println();
        
        //Remove duplicates
        System.out.println("After Remove duplicates elements : ");
        int[] uniqueArray = removeDuplicates(arr);
        System.out.println(Arrays.toString(uniqueArray));
    }
        public static int[] removeDuplicates(int[] arr) 
        {
           return Arrays.stream(arr).distinct().toArray();
           //Arrays.stream(array): Converts the array into a stream of integers.
          //.distinct(): Filters the stream to keep only unique elements.
         //.toArray(): Collects the filtered elements back into an array.
        } 
}
