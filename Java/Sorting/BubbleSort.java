package Sorting;
//Bubble Sort
// Idea: if arr[i] > arr[i+1] swap them. To place the element in their respective position, we have to do the following operation N-1 times.
// Bubble Sort Implementation in Java
public class BubbleSort
{
    // Method to print an array
    public static void printArray(int arr[])
    {
        // Iterating through the array and printing each element
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");  // Print the current element
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        // Define an array to be sorted
        int arr[] = {7, 8, 3, 1, 2};
        
        // Print the original array
        System.out.println("Given Array:");
        printArray(arr);

        // Bubble Sort algorithm
        // Outer loop runs n-1 times where n is the length of the array
        // Time Complexity: O(n^2) in the worst and average cases
        for (int i = 0; i < arr.length - 1; i++) // Outer loop
        {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                // Check if the current element is greater than the next element
                if (arr[j] > arr[j + 1])
                {
                    // Swap the elements if they are out of order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}