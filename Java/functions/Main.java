package functions;
// A function is a block of code that performs a specific task.
//Why are functions used? 
// If some functionality is performed at multiple places in software, then  rather than writing the same code, again and again, we create a function  and call it everywhere. This helps reduce code redundancy. 
// Functions make maintenance of code easy as we have to change at one  place if we make future changes to the functionality. 
// Functions make the code more readable and easy to understand. 
// The syntax for function declaration is :
// return-type function_name (parameter 1, parameter2,  …… parameter n)
//{
      //function_body 
// } 
// return-type 
    public class Main 
    {
        //A METHOD to calculate sum of 2 numbers - a & b
        public static void sum(int a, int b) 
        {
            int sum = a + b;
            System.out.println("Sum of a and b is : " + sum);
        }
       
        public static void main(String[] args) 
        {
           int a = 10;
           int b = 20;
            sum(a, b); // Function Call
     
        }
     }
     

