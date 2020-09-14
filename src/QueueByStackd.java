import java.util.Stack;

public class QueueByStackd {

    Stack<Integer> s=new Stack<Integer>();
    Stack<Integer> s1=new Stack<Integer>();

    public void enqueue(int en)
    {   //emptying the stack1
        while(!s.isEmpty()){
            s1.push(s.pop());
        }
        //add data iun emptied stack 1
        s.push(en);
        // now make back all the data from stack 2 to stack 1
     while(!s1.isEmpty())
     {
         s.push(s1.pop());
     }

    }
    public int dequeue()
    {     int l;
        if(s.isEmpty())
        {System.out.println("EMPTY CANNOT DELETE");
        return -1;}

        else {
            l= s.peek();
           s.pop();
        }
        return l;
    }
    public void showstack()
    {   Stack<Integer>tem=new Stack<>();
        tem=s;
        while(!tem.isEmpty())
        {
            System.out.println(tem.pop());
        }
    }

}
/*
 public static class MyQueue<Integer>{
        Stack<Integer> s=new Stack<>();
        Stack<Integer>s1=new Stack<>();
        public void enqueue(Integer en)
        {
            while(!s.isEmpty())
            {s1.push(s.pop());}
            s.push(en);
            while(!s1.isEmpty())
            {s.push(s1.pop());}

        }
        public void dequeue()
        {
            if(s.isEmpty())
            {
                System.out.println("UNDERFLOW!!!!");
            }
            else {
                s.pop();
            }
        }
        public Integer peek(){
            return s.peek();

        }
    }

 */