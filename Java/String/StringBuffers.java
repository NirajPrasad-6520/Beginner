package String;
public class StringBuffers 
{
    public static void main(String[] args) 
    {
    //StringBuffer Class append() Method
        System.out.println("StringBuffer Class append() Method :");
        StringBuffer sb=new StringBuffer("Hello ");  
        sb.append("Java");//now original string is changed  
        System.out.println(sb);
        System.out.println();

    //StringBuffer insert() Method
        System.out.println("StringBuffer insert() Method :");
        StringBuffer sb1=new StringBuffer("Hello");
        sb1.insert(1,"Java");//now original string is changed  
        System.out.println(sb1);
        System.out.println();

    //StringBuffer replace() Method
        System.out.println("StringBuffer replace() Method :");
        StringBuffer sb2=new StringBuffer("Hello");
        sb2.replace(1,3,"Java");  
        System.out.println(sb2); 
        System.out.println();

    //StringBuffer delete() Method
        System.out.println("StringBuffer delete() Method :");
        StringBuffer sb3=new StringBuffer("Hello ");
        sb3.delete(1,3);  
        System.out.println(sb3);
        System.out.println();

    //StringBuffer reverse() Method
        System.out.println("StringBuffer reverse() Method :");
        StringBuffer sb4=new StringBuffer("Hello");
        sb4.reverse();
        System.out.println(sb4);
        System.out.println();

    //StringBuffer capacity() Method
        System.out.println("StringBuffer capacity() Method :");
        StringBuffer sbb=new StringBuffer();  
        System.out.println(sbb.capacity());//default 16  
        sbb.append("Hello");  
        System.out.println(sbb.capacity());//now 16  
        sbb.append("Java is my favourite language");  
        System.out.println(sbb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2 
        System.out.println();        
    }
}