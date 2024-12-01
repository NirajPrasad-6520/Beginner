package String.Exercise;
public class CountCharacter 
{
    public static void main(String[] args) 
    {
        String s = "An object that represents a number of character values";
        int count = 0;

        for(int i = 0; i < s.length(); i++ )
        {
            if (s.charAt(i) != ' ') 
            {
                count++;                
            }
        }
        s = s.replaceAll("\\s+", "");    
            
        System.out.println("String after remove spaces : " + s);  
        System.out.println(count);   
        
        String ss = "An object that represents a number of character values";
                    
        //Replace space with specific character ch    
        ss = ss.replace(' ', '-');    
            
        System.out.println("String after replacing spaces with given character: " + ss);  
    }    
}