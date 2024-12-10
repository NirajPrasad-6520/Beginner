package Array.SingleDimensionalArray;

public class LargestAndSmallestElementArray
{
    public static void main(String[] args)
    {
        int arr[] = new int[]{111, 22, 35, 444, 50, 12, 14, 15};
        
        // Initialize max and min with the first element of the array
        int max = arr[0];
        int min = arr[0];

        // Loop through the array to find the largest and smallest elements
        for (int i = 0; i < arr.length; i++)
        {
            // Update max if the current element is greater than max
            if(arr[i] > max)
                max = arr[i];

            // Update min if the current element is smaller than min
            else if(arr[i] < min)
                min = arr[i];
        }
        // Print the largest and smallest elements in the array
        System.out.println("Largest element present in given array: " + max);
        System.out.println("Smallest element present in given array: " + min);
    }
}