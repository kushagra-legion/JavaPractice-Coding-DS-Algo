public class MyStack {

    public static class Node{
        String data;
        Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    Node start;

    public MyStack() {
        this.start = null;
    }

    public void insert (String Data)
    {  if(start==null)
      {  Node newstart=new Node(Data,null);
        start=newstart;
      }
    else {
        Node newstart=new Node(Data,start);
        start=newstart;
         }
    }

    public void pop(){

        if(start==null)
        {
            System.out.println("Stack Empty Not Able To POP !!!");
        }
        else {
            String itemtodelete=start.data;
            Node temp=start;
            start=start.next;
            temp=null;
            System.out.println("DELETED ITEM IS -->"+itemtodelete);
        }
    }

    public void printStack(){
        Node temp=start;
        while(temp!=null){
            System.out.println(temp.data+"");
            temp=temp.next;
        }

    }

    public String getTopofStack()
    {
        return start.data;
    }
    public  boolean isEmpty()
    {
        if(start==null)
        {return true;}
        else return false;
    }
}
