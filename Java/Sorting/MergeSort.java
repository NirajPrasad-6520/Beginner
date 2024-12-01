package Sorting;
public class MergeSort 
{
    //nlogn - Time Complexity
    public static void Conquer(int arr[], int si, int mid, int ei)
    {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        //O(n)
        while(idx1 <= mid && idx2 <= ei)
        {
            if(arr[idx1] <= arr[idx2])
            {
                merged[x++] = arr[idx1++];
            }
            else
            {
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid)
        {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei)
        {
            merged[x++] = arr[idx2++];            
        }

        for(int i = 0, j = si; i < merged.length; i++, j++)
        {
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int si, int ei)
    {
        if(si >= ei)
        {
            return;
        }
        //O(logn)
        int mid = si +(ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        Conquer(arr, si, mid, ei);
    }

    // Helper method to print array
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
        int arr[] = {6, 3, 9, 5, 2, 8};
        System.out.println("Given Array:");
        printArray(arr);

        divide(arr, 0, arr.length - 1);
        
        System.out.println("Sorted Array:");
        printArray(arr);
    }    
}