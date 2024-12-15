package Sorting;
public class QuickSort
{
    // Partition function: Divides the array into two halves based on the pivot
    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; // Choosing the last element as the pivot
        int i = low - 1; // Pointer for the smaller element

        // Iterate through the array and rearrange elements
        for (int j = low; j < high; j++)
        {
            if (arr[j] < pivot) // If the current element is smaller than the pivot
            {
                i++; // Increment the pointer
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot in its correct position (all smaller elements to its left and larger to its right)
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i; // Return the index of the pivot
    }

    // Recursive QuickSort function
    public static void quickSort(int arr[], int low, int high) 
    {
        if (low < high) // Base case: When the low pointer crosses the high pointer
        {
            // Partition the array and get the pivot index
            int pidx = partition(arr, low, high);

            // Recursively sort the left subarray
            quickSort(arr, low, pidx - 1);

            // Recursively sort the right subarray
            quickSort(arr, pidx + 1, high);
        }
    }

    // Helper function to print an array
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
        // Input array to be sorted
        int[] arr = {6, 3, 9, 5, 2, 8};

        // Print the original array
        System.out.println("Original array:");
        printArray(arr);

        // Perform QuickSort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}