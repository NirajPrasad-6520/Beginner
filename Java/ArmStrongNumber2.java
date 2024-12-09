//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits. It is also known as pluperfect, or Plus Perfect, or Narcissistic number.

public class ArmStrongNumber2
{
    public static boolean isArmstrong(int number)
        {
            int originalNumber = number;
            int result = 0;
            int digits = String.valueOf(number).length();
    
            while (number != 0)
            {
                int remainder = number % 10;
                result += Math.pow(remainder, digits);
                number /= 10;
            }
            return result == originalNumber;
        }
        public static void main(String[] args)
        {
            int number = 6;
    
            if (isArmstrong(number))
            {
                System.out.println(number + " is an Armstrong number.");
            }
            else
            {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
}