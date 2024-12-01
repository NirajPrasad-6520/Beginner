import java.util.*;

public class userInput 
{
    public static void main( String[] args ) 
    {
        int numberA;
        int numberB;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for a");

        numberA = input.nextInt();

        System.out.println("Enter the value for b");

        numberB = input.nextInt();
        System.out.println(numberA + numberB);

    // Write a Java program to take the temperature from the user in Celsius, convert it into Fahrenheit and display it to the user. You can use the following formula for this purpose: 
    //F=9C/5+32 Where, C is the temperature in Celsius and F is the temperature in Fahrenheit.
        System.out.print("Enter temperature in Celsius: ");
        int celsius = input.nextInt();
        int fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        input.close();
}
}
