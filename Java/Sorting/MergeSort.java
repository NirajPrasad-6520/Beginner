package Sorting;
// Merge Sort Implementation in Java
public class MergeSort
{
    // Conquer step: Merges two sorted subarrays into a single sorted subarray
    public static void Conquer(int arr[], int si, int mid, int ei)
    {
        // Create a temporary array to hold the merged result
        int merged[] = new int[ei - si + 1];

        // Pointers to traverse the left and right subarrays
        int idx1 = si; // Starting index of the left subarray
        int idx2 = mid + 1; // Starting index of the right subarray
        int x = 0; // Pointer for the merged array

        // Merge elements from both subarrays in sorted order
        while (idx1 <= mid && idx2 <= ei)
        {
            if (arr[idx1] <= arr[idx2]) // Compare elements
            {
                merged[x++] = arr[idx1++]; // Add smaller element to merged array
            }
            else
            {
                merged[x++] = arr[idx2++]; // Add smaller element to merged array
            }
        }

        // Add any remaining elements from the left subarray
        while (idx1 <= mid)
        {
            merged[x++] = arr[idx1++];
        }

        // Add any remaining elements from the right subarray
        while (idx2 <= ei)
        {
            merged[x++] = arr[idx2++];
        }

        // Copy the merged array back to the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) 
        {
            arr[j] = merged[i];
        }
    }

    // Divide step: Recursively divides the array into smaller subarrays
    public static void divide(int arr[], int si, int ei)
    {
        if (si >= ei) // Base case: Subarray with one or no element is already sorted
        {
            return;
        }

        // Calculate the midpoint of the current array
        int mid = si + (ei - si) / 2;

        // Recursively divide the left subarray
        divide(arr, si, mid);

        // Recursively divide the right subarray
        divide(arr, mid + 1, ei);

        // Conquer: Merge the sorted subarrays
        Conquer(arr, si, mid, ei);
    }

    // Helper method to print an array
    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        // Input array to be sorted
        int arr[] = {6, 3, 9, 5, 2, 8};
        System.out.println("Given Array:");
        printArray(arr);

        // Perform Merge Sort
        divide(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}