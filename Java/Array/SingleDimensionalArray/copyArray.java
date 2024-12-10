package Array.SingleDimensionalArray;
import java.util.Scanner;

public class copyArray
{
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            
            // Initialize array with user input
            System.out.print("Enter the number of elements: ");
            int size = scanner.nextInt();
            int[] arr1 = new int[size];
    
            //input
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++)
                arr1[i] = scanner.nextInt();
    
            // Create another array arr2 with size of arr1
            int[] arr2 = new int[arr1.length];
    
            // Copying all elements of one array into another
            for (int i = 0; i < arr1.length; i++)
                arr2[i] = arr1[i];

            // Displaying elements of array arr1
            System.out.println("Elements of original array: ");
            for (int i = 0; i < arr1.length; i++)
                System.out.print(arr1[i] + " ");
            System.out.println();
    
            // Displaying elements of array arr2
            System.out.println("Elements of new array: ");
            for (int i = 0; i < arr2.length; i++)
                System.out.print(arr2[i] + " ");
            scanner.close();
        }
}