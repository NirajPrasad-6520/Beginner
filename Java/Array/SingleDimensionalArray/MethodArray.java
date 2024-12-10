package Array.SingleDimensionalArray;

public class MethodArray
{
    // Java Program to demonstrate the way of passing an array to a method

    // Creating a method which receives an array as a parameter
    static void min(int arr[])
    {
        // Initialize min with the first element of the array
        int min = arr[0];
        // Loop through the array to find the smallest element
        for(int i = 1; i < arr.length; i++)
        {
            // Update min if the current element is smaller
            if(min > arr[i])
                min = arr[i];
        }
        // Print the smallest element found
        System.out.println(min);
    }
    public static void main(String args[])
    {
        // Declare and initialize an array
        int a[] = {33, 3, 4, 5, 1, 0};
        // Passing the array to the min() method
        min(a);
    }
}