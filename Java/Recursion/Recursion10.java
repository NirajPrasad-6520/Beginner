package Recursion;
// Check if an array is sorted (Strictly Increasing)
public class Recursion10
{
    // Recursive method to check if the array is sorted
    public static boolean isSorted(int arr[], int index) {
        // Handle edge case: Empty or single-element arrays are always sorted
        if (arr.length <= 1)
        {
            return true;
        }
        // Base case: Reached the last element, array is sorted
        if (index == arr.length - 1)
        {
            return true;
        }
        
        // Check if the current element is less than the next element
        if (arr[index] < arr[index + 1])
        {
            // Recursive call to check the rest of the array
            return isSorted(arr, index + 1);
        }
        else
        {
            // Return false if a pair is out of order
            return false;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1, 3, 6}; // Test case: strictly increasing
        System.out.println(isSorted(arr, 0)); // Output: true
    }
}