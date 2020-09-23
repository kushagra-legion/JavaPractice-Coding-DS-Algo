public class MyTree {

private class Node{
    Node left;
    Node right;
    int value;
    public Node(int val) {
        value=val;
    }
}
    Node root;
  public void insert (int value)
  {
      if(root==null)
      {
          root=new Node(value);
          return;
      }
      Node current = root;
      while(true) {
          if(value<current.value)
          {if(current.left==null)
          {current.left=new Node(value);
          return;}
          else{
              current=current.left;}}
          else {
              if(current.right==null)
              {current.right=new Node(value);
              return;}
              else{
              current = current.right;}
          }

      }
  }

  public boolean find(int value)
  {
      Node current =root;
      while(current!=null)
      {
          if(value<current.value)
          {   if(current.left==null)
               {break;}
              current=current.left;}
          if(value>current.value)
          {   if(current.right==null)
              {break;}
              current=current.right;}
          else{return true;}
      }
      return false;
  }

  public void PreOrder(){
      PreOrder(root);
  }
 private void PreOrder(Node head)
 {   if(head==null)
     {return;}
     System.out.println(head.value);
     PreOrder(head.left);
     PreOrder(head.right);
 }
}

