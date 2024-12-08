import java.util.*;
public class reverse_words
{
    public static void main(String[] args)
    {
        System.out.print("Enter Word: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";

        for(int i = 0 ; i < str.length(); i++)
        rev = str.charAt(i) + rev;
        System.out.println("Reverse of given  word: " + rev);

        sc.close();
    }
}