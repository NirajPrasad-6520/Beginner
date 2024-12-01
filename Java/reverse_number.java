import java.util.*;
public class reverse_number 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            //Using While loop
                System.out.println("Using While loop for reverse number:");
                int n, r, rev = 0;
                System.out.print("Enter number:  ");
                n = sc.nextInt();

                while(n>0)
                {
                    r = n % 10;//last digit
                    rev = rev  * 10 +  r;
                    n = n  / 10;
                }
                System.out.println("Reverse number : "+rev);
                
                System.out.println();

            //Using for loop
                System.out.println("Using for loop:");
                int revs = 0;
                System.out.print("Enter number:  ");
                n = sc.nextInt();
                
                for(;n != 0;n = n / 10)
                {
                    r = n % 10;//last digit
                    revs = revs * 10 + r;
                }
                System.out.println("Reverse number: "+revs);

                sc.close();
        }
    }
}
