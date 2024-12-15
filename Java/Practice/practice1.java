package Practice;
import java.util.Arrays;
public class practice1
{
    public static void pnumber(int n)
    {
        if(n == 6)
        {
            return;
        }
        System.out.println(n);

        pnumber(n + 1);
    }
    public static void main(String[] args)
    {
       int n = 0;
       pnumber(n);
}
}