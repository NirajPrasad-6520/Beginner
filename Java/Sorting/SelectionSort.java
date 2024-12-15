package Sorting;
public class SelectionSort
{
    // Helper function to print the array
    public static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        // Input array
        int arr[] = {7, 8, 3, 1, 2, 15, 10};
        System.out.println("Given Array:");
        printArray(arr);

        // Time Complexity: O(n^2)
        // Outer loop iterates over each element in the array
        for (int i = 0; i < arr.length - 1; i++)
        {
            // Assume the current element is the smallest
            int smallest = i;

            // Inner loop finds the smallest element in the unsorted portion of the array
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[smallest] > arr[j])
                {
                    smallest = j; // Update the index of the smallest element
                }
            }

            // Swap the smallest element with the first element of the unsorted portion
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}