package Array.MultidimensionalArray;

public class MatrixAdditionAndMultiplyArray 
{
    public static void main(String[] args) 
    {
        //Addition Matrix
        System.out.println("Addition Matrix :");
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};

        int [][] arr = new int[3][3];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                arr[i][j] = a[i][j] + b[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Multiply Matrix
        System.out.println("Multiply Matrix :");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                arr[i][j] = a[i][j] * b[i][j];
                System.out.print(arr[i][j] + " ");
            }    
            System.out.println();    
        }
    }
}
