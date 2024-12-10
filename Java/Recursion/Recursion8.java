package Recursion;
// Tower of Hanoi problem
public class Recursion8
{
    public static void towerOfHanoi(int n, String src, String helper, String dest) 
    {
        // Base case: If there's only one disk, move it directly to the destination
        if (n == 1)
        {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        // Recursive case: Move n-1 disks from src to helper using dest as a helper
        towerOfHanoi(n - 1, src, dest, helper);

        // Move the nth disk from src to dest
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

        // Move the n-1 disks from helper to dest using src as a helper
        towerOfHanoi(n - 1, helper, src, dest);
    }
    public static void main(String[] args)
    {
        int n = 3; // Number of disks
        towerOfHanoi(n, "S", "H", "D"); // S = Source, H = Helper, D = Destination
    }
}