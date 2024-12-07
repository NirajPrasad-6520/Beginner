public class OperatorExample
{
    public static void main(String args[])
    {
    //Unary operator
    System.out.println("Unary operator");
        int x = 10;
        System.out.println(x++);//first print 10 then increment (11)
        System.out.println(++x);//first increment then print 12
        System.out.println(x--);//first print 12 then  decrement (11)
        System.out.println(--x + "\n");//first decrement then print 10

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
        System.out.println(z + "\n");

        //Left Shift Operator
        System.out.println("Left Shift Operator : ");
        System.out.println(10 << 2);//10 * 2^2 = 10 * 4 = 40
        System.out.println(10 << 3);//10 * 2^3 = 10 * 8 = 80
        System.out.println(20 << 2);//20 * 2^2 = 20 * 4 = 80
        System.out.println(15 << 4);//15 * 2^4 = 15 * 16 = 240
        System.out.println();

        //Right Shift Operator Example
        System.out.println("Right Shift Operator : ");
        System.out.println(10 >> 2);//10 / 2^2 = 10 / 4 = 2
        System.out.println(20 >> 2);//20 / 2^2 = 20 / 4 = 5
        System.out.println(20 >> 3);//20 / 2^3 = 20 / 8 = 2
    }
}