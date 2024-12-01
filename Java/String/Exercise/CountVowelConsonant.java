package String.Exercise;
public class CountVowelConsonant 
{
    public static void main(String[] args) 
    {   
        int vCount = 0, cCount = 0; 
        String str = "This is a really simple sentence";    
        //Converting entire string to lower case to reduce the comparisons    
        str = str.toLowerCase();    
            
        for(int i = 0; i < str.length(); i++) 
        {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
            {   
                System.out.print(str.charAt(i) + " ");    
                vCount++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
            {  
                cCount++;    
            }    
        }    
        System.out.println();
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);    
    }    
    
}
