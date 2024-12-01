package String;
public class StringBuilders 
{
    public static void main(String args[])
    {  
    //StringBuilder append() method
        System.out.println("StringBuilder append() method :");
        StringBuilder sb=new StringBuilder("Hello ");  
        sb.append("Java");//now original string is changed  
        System.out.println(sb);
        System.out.println();
        
    //StringBuilder insert() method
        System.out.println("StringBuilder insert() method :");
        StringBuilder sb1=new StringBuilder("Hello ");
        sb1.insert(1,"Java");//now original string is changed
        System.out.println(sb1);
        System.out.println();

    //StringBuilder replace() method
        System.out.println("StringBuilder replace() method :");
        StringBuilder sb2=new StringBuilder("Hello");
        sb2.replace(1,3,"Java");  
        System.out.println(sb2);
        System.out.println();

    //StringBuilder delete() method
        System.out.println("StringBuilder delete() method :");
        StringBuilder sb3=new StringBuilder("Hello");
        sb3.delete(1,3);  
        System.out.println(sb3);
        System.out.println();

    //StringBuilder reverse() method
        System.out.println("StringBuilder reverse() method :");
        StringBuilder sb4=new StringBuilder("Hello");
        sb4.reverse();
        System.out.println(sb4);
        System.out.println();

    //StringBuilder capacity() method
        System.out.println("StringBuilder capacity() method :");
        StringBuilder sb5=new StringBuilder();
        System.out.println(sb5.capacity());//default 16   
        sb5.append("Hello");    
        System.out.println(sb5.capacity());//now 16    
        sb5.append("Java is my favourite language");    
        System.out.println(sb5.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2 
    }  
}