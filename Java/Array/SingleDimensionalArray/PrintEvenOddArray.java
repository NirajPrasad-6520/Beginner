package Array.SingleDimensionalArray;
public class PrintEvenOddArray 
{
    public static void main(String[] args) 
    {
    //Program to print the elements of an array present on even position

        int arr[] = new int[]{1,2,3,4,5,12,14,15};
        System.out.println("Elements of given array present on even position: "); 

    //Loop through the array by incrementing value of i by 2  
   //Here,i will start from 1 as first even positioned element is present at position 1.  
        for (int i = 1; i < arr.length; i = i+2)
            System.out.print(arr[i] + " ");
            System.out.println();
            
    //Program to print the elements of an array present on odd position
            System.out.println("Elements of given array present on odd position: ");
            for(int j = 0; j < arr.length; j = j+2)
               System.out.print(arr[j] + " ");
               System.out.println();

    //Find all even array in given array.
            System.out.println("Even numbers in the array:");
        // Loop through the array to find even numbers
            for (int num : arr) 
                if (num % 2 == 0) 
                    System.out.print(num + " ");
                    System.out.println();

    //Find all odd array in given array.
            System.out.println("Odd numbers in the array:");
        // Loop through the array to find odd numbers
                    for (int i = 0; i < arr.length; i++)
                    if (arr[i]%2!=0) 
                    System.out.print(arr[i] + " ");
    }
}

