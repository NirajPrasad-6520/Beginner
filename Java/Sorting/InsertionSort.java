package Sorting;
//Insertion Sort
// Idea: Take an element from the unsorted array, place it in its corresponding position in the sorted part, and shift the elements accordingly. 
public class InsertionSort 
{
    public static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int arr[] = {7, 8, 3, 1, 2, 5};
        System.out.println("Given Array :");
        printArray(arr);

        //Time Complexity: O(n2)
        //insertion sort
        for(int i = 0; i < arr.length; i++)
        {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j] )
            {
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j + 1] = current;
        }
        System.out.println("Sorted Array:");
        printArray(arr);
    }    
}