package palindrome_using_stacks_and_queues;
import java.util.*;

public class Palindrome_using_stacks_and_queues 
{
    LinkedList<Character> stack;
    LinkedList<Character> queue;
    
    Palindrome_using_stacks_and_queues()
    {
        stack = new LinkedList();
        queue =  new LinkedList();
        stack.clear();
        queue.clear();
    }
    
    
    public void palindrome(String str)
    {
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        
        int index = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= '0' && arr[i] <= '9')
            {
                stack.push(arr[i]);
                queue.addLast(arr[i]);
                index++;
            }
        }
        
        //System.out.println("index: "+index);
        //System.out.println(queue);
        int count = 0;
        while(stack.isEmpty() == false)
        {
            char a = stack.pop();
            char b = queue.removeFirst();
            //System.out.println("a : "+ a + "b: "+ b);
            if(a == b)
            {
                count++;               
            }
            else
               break;
        }
        //System.out.println("count: "+count);
        if(count == index)
            System.out.println(str + " is a palindrome.");
        else
            System.out.println(str + " is not a palindrome");
            
    }
    
    
    public static void main(String[] args)          //run all 3 calls independently since everytime new object needs to be created
    {
        Palindrome_using_stacks_and_queues p1 = new Palindrome_using_stacks_and_queues();
        Palindrome_using_stacks_and_queues p2 = new Palindrome_using_stacks_and_queues();
        Palindrome_using_stacks_and_queues p3 = new Palindrome_using_stacks_and_queues();
        p1.palindrome("I did , did I");
        p2.palindrome("hello");
        p3.palindrome("don't nod");
    }
    
}
