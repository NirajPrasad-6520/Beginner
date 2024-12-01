package Array.MultidimensionalArray;
import java.util.*;
public class TwoDArrays 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows number :");
        int rows = sc.nextInt();        
        System.out.println("Enter columns number :");
        int columns = sc.nextInt();

        int [][] numbers = new int[rows][columns];
        System.out.println("Enter matrix numbers :");

        //input
        //rows
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            numbers[i][j] = sc.nextInt();
        }
        System.out.println("Output:");

        //output
        for(int i =0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }System.out.println();
        }  sc.close();      
    }
    
}
