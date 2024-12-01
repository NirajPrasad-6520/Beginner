package Recursion;
//Tower of Hanoi
public class Recursion8 
{
    public static void TowerOfHanoi(int n , String src, String helper, String dest)
    {
        if(n == 1)
        {
            System.out.println("transfer disk " + n + " form " + src + " to " + dest);
            return;
        }
        TowerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " form " + src + " to " + dest);
        TowerOfHanoi(n - 1, helper, src, dest);
    }
    public static void main(String[] args) 
    {
        int n = 3; //n = 1; n = 2; n = 3;
        TowerOfHanoi(n," S", "H","D");
    }    
}