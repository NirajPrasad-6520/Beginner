package Sorting;
//Insertion Sort
// Idea: Take an element from the unsorted array, place it in its corresponding position in the sorted part, and shift the elements accordingly.
// Insertion Sort Implementation in Java
public class InsertionSort
{
    public static void printArray(int arr[])
    {
        // Loop through the array and print each element
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");  // Print the element followed by a space
        }
        System.out.println();  // Print a new line after the array
    }
    public static void main(String[] args)
    {
        // Define the array to be sorted
        int arr[] = {7, 8, 3, 1, 2, 5};
        
        // Print the original array
        System.out.println("Given Array:");
        printArray(arr);

        // Insertion Sort algorithm
        // Outer loop iterates through the array
        for (int i = 1; i < arr.length; i++)
        {
            int current = arr[i];  // Store the current element to be inserted
            int j = i - 1;  // Start comparing with the previous elements
            
            // Shift elements of the sorted portion of the array
            // until the correct position for `current` is found
            while (j >= 0 && current < arr[j])
            {
                arr[j + 1] = arr[j];  // Shift element one position to the right
                j--;  // Move to the next element on the left
            }

            // Place the `current` element in its correct position
            arr[j + 1] = current;
        }
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}