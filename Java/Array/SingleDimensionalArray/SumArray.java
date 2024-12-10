package Array.SingleDimensionalArray;
// Java Program to print the sum of all the items of the array
public class SumArray
{
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,3,4,5,12,14,15};
        int sum=0;
        for(int i = 0; i < arr.length; i++)
        sum = sum + arr[i];
        System.out.println("Sum of all the items of the array is " + sum + "\nNumbers of elements present in given array : " + arr.length);
    }
}