import java.lang.Math;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom; 
public class randomnumber 
{
    
    /**
     * Generating Random Number in Java
     * 1. Random Class
     * 2. Math.Random()
     * 3. ThreadLocalRandom
     */

     public static void main(String[]args)
     {
       Random  random=new Random();
       System.out.println("1. Random class: \n");

         for(int i = 1; i <= 5; i++)
           {
               System.out.println("Random int: " + random.nextInt());
               System.out.println("Random double: " + random.nextDouble());
               System.out.println("Random float: " + random.nextFloat());
               System.out.println("Random boolean: " + random.nextBoolean()+"\n");
           }

           System.out.println("2. Math.random():\n");
           for(int i = 1; i <= 5; i++)
           {
               System.out.println("1st Random Number: " + Math.random());
               System.out.println("2nd Random Number: " + Math.random());
               System.out.println("3rd Random Number: " + Math.random());
               System.out.println("4th Random Number: " + Math.random()+"\n");
           }   

           System.out.println("3. ThreadLocalRandom");
           System.out.println(ThreadLocalRandom.current().nextInt());
           System.out.println(ThreadLocalRandom.current().nextDouble());
           System.out.println(ThreadLocalRandom.current().nextFloat());
           System.out.println(ThreadLocalRandom.current().nextBoolean());

     }
}
