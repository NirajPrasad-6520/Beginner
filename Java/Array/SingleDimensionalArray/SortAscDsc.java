package Array.SingleDimensionalArray;
//Java Program to sort the elements of an array in ascending order
public class SortAscDsc
 {
     public static void main(String[] args) 
      {    
          int [] arr = new int [] {5, 2, 8, 7, 1};     
          int h = 0;
          System.out.println("Elements of original array: ");
            for (int i = 0; i < arr.length; i++) 
            {     
              System.out.print(arr[i] + " ");    
            }    
        
        //Sort the array in ascending order    
            for (int i = 0; i < arr.length; i++) 
            {     
                for (int j = i+1; j < arr.length; j++) 
                {     
                    if(arr[i] > arr[j]) 
                    {    
                       h = arr[i];    
                       arr[i] = arr[j];    
                       arr[j] = h;    
                    }     
                }     
            }System.out.println();    
        
        //Displaying elements of array after sorting    
             System.out.println("Elements of array sorted in ascending order: ");    
                for (int i = 0; i < arr.length; i++) 
                   {     
                      System.out.print(arr[i] + " ");    
                   }
                   System.out.println();
                   
        //Java Program to sort the elements of an array in descending order.
                int [] arr1 = new int [] {5, 2, 8, 7, 1};     
                int c = 0;    
            
            //Displaying elements of original array    
                System.out.println("Elements of original array: ");    
                   for (int i = 0; i < arr1.length; i++) 
                   {     
                      System.out.print(arr1[i] + " ");    
                   }    
            
            //Sort the array in descending order    
                   for (int i = 0; i < arr1.length; i++)
                    {     
                       for (int j = i+1; j < arr1.length; j++) 
                        {     
                           if(arr1[i] < arr1[j]) 
                            {    
                              c = arr1[i];    
                              arr1[i] = arr1[j];    
                              arr1[j] = c;
                            }
                        }
                    }System.out.println();    
            
            //Displaying elements of array after sorting    
                System.out.println("Elements of array sorted in descending order: ");    
                    for (int i = 0; i < arr1.length; i++) 
                    {     
                        System.out.print(arr1[i] + " ");
                    }    
      }
}
