package Stack;
import java.util.*;
//Push at the bottom of Stack
public class ques
{
    public static void pushAtBottom(int data, Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void main(String[] args)
    {
        Stack<Integer> s =  new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(5);

        pushAtBottom(4,s);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
