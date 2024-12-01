package Sorting;
//Selection Sort
// Idea: The inner loop selects the minimum element in the unsorted array and places the elements in increasing order. 
public class SelectionSort 
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
        int arr[] = {7, 8, 3, 1, 2, 15, 10};
        System.out.println("Given Array:");
        printArray(arr);

        //Time Complexity: O(n2)
        //Selection sort
        for(int i = 0; i < arr.length - 1; i++)
        {
            int smallest = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[smallest] > arr[j] )
                {
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array:");
        printArray(arr);
    }    
}