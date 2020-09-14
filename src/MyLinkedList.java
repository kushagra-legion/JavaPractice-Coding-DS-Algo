import java.util.List;

public class MyLinkedList {
    Node start;
    public MyLinkedList() {
         this.start = null;
    }
    public static class Node{
        String data;
        Node next;
        public Node(String data,Node next)
        {
            this.data=data;
            this.next=next;
        }
    }
    void add (String datatoinsert)
    {
      if(start==null)
      {
          start= new Node(datatoinsert,null);

      }
      else {
          Node temp=start;
          while((temp.next!=null))
          {
              temp=temp.next;
          }
          Node newnode=new Node(datatoinsert,null);
          temp.next=newnode;

      }

    }

   public void remove()
   {
       if (start==null){
       System.out.println( "Already Empty !!!!!! Cannot delete");
       }

       else if (start.next==null){
             String item=start.data;
             start=null;
             System.out.println("item deleted "+item);
       }
       else {
           String item=start.data;
           Node temp=start;
           start=start.next;
           temp=null;
           System.out.println( "the Deleted Value is "+item);
       }

   }

    public void printlinkedlist()
    { Node temp=start;
        while(temp!=null)
        {   System.out.print(temp.data+",");
            temp=temp.next;

        }
    }

    public void reverselist()
    {
        Node temp=start;
        int size=0;
        while(temp!=null)
        {size++;
        temp=temp.next;}
        Node newone=null;
        Node newstart=function(size,start,newone);
        //System.out.println(1);
        Node temporary=newstart;
        System.out.println("\n Reversed linked list --> ");
        while(temporary!=null)
        {
            System.out.print(temporary.data+",");
            temporary=temporary.next;

        }

    }
  private Node function(int k,Node old,Node newone)
  {
      int i=0;
      Node temp2=newone;
      Node temp=old;
      if(k==1){
      Node arb=newone;
         while(arb.next!=null)
         { arb=arb.next;
         }
         Node neo=new Node(old.data,null);
         arb.next=neo;
         return newone;
      }

      while(i<k)
      {
          i++;
         // System.out.println(i);
          temp=temp.next;
          if(i==k-1)
          {  //first node jab null ho newone
              if(temp2==null) {
                  Node newst=new Node(temp.data,null);
                  temp2=newst;
          }
              else{ Node arb=temp2;
                  while(arb.next!=null)
                  {
                      arb=arb.next;
                  }
                  Node adding=new Node(temp.data,null);
                  arb.next=adding;
              }
          }
      }
     return function(k-1,old,temp2);
  }


}
