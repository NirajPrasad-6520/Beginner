package Recursion;
//Print all the subSequences of a string
public class Recursion13 
{
    public static void subSequences(String str, int idx, String newString)
    {
        if(idx == str.length())
        {
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);

        //to be
        subSequences(str, idx + 1, newString + currchar);

        //not to be
        subSequences(str, idx + 1, newString);
    }
    public static void main(String[] args) 
    {
        String str1 = "abc";
        String str2 = "aaa";
        subSequences(str1, 0, "");
        subSequences(str2, 0, "");        
    }   
}