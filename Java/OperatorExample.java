public class OperatorExample
{  
    public static void main(String args[])
    {  
    //Unary operator
    System.out.println("Unary operator");
        int x = 10;  
        System.out.println(x++);//10 (11)  
        System.out.println(++x);//12  
        System.out.println(x--);//12 (11)  
        System.out.println(--x + "\n");//10

    //Arithmetic Operator
        System.out.println("Arithmetic Operator:");
        int a = 10;  
        int b = 5;  
        System.out.println(a+b);//15
        System.out.println(a-b);//5  
        System.out.println(a*b);//50  
        System.out.println(a/b);//2  
        System.out.println(a%b);//0  

        // Operator priority
        System.out.println("Operator priority");
        int p = 5;
        int y = 4;        
        int c = 3;        
        double z = (p + y - c) / p * y;
        System.out.println(z);
    }
}  