import java.util.*;
public class JavaPractice {
  public static void main (String [] arg)
    {

   //<<<<----------LinkedList Khud Ka Implementation with Testing------------->>>>>>>>>>
/*
        MyLinkedList linkedList=new MyLinkedList();
        linkedList.add("Kushagra ");
        linkedList.add("gupta ");
        linkedList.add("AT");
        linkedList.add("work");
        linkedList.add("work2");
        linkedList.add("work3");
        linkedList.add("work4");
      //  linkedList.remove();
        linkedList.printlinkedlist();
        linkedList.reverselist();
*/


  //<<<<----------Stack Khud Ka Implementation with Testing------------->>>>>>>>>>

      /*      MyStack stack=new MyStack();
        stack.insert("Modi ");
        stack.insert("Is ");
        stack.insert("The ");
        stack.insert("Most ");
        stack.insert("Popular ");
        stack.insert("World ");
        stack.insert("Leader ");
        stack.pop();
        stack.printStack();
       // stack.pop();stack.pop();stack.pop();stack.pop();stack.pop();stack.pop();stack.pop();
        stack.printStack();
   */

  //<<<<<----------- Stack Problem Ke Liye  (abhi integer ke liye real mai brackets ka hai) varna ye simple palindrome hai------------>>>>>>>>>>
     // StackProblem sp=new StackProblem();

     // palindrome palindrome=new palindrome();
   //  PalindromeStringHackerrrank pr=new PalindromeStringHackerrrank();
     //   indexOfArrayList il=new indexOfArrayList();
        //tcs t=new tcs();
        //recursion1 r=new recursion1();
       // Leetcode l=new Leetcode();
       // subsetproblem s=new subsetproblem();
      //  powersetofstring p1=new powersetofstring();
        // powersetofstring p2=new powersetofstring("APPLE,ORANGE,MANGO");
      // inttobinary i=new inttobinary();
      //  Goodhippoproblem g=new Goodhippoproblem();
      // HANU h=new HANU();
    /*    QueueByStackd q=new QueueByStackd();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
        q.showstack();
        q.dequeue();
        q.showstack();
        q.enqueue(50);
        q.showstack();

     */
      //  ProblemDaffo problemDaffo=new ProblemDaffo();

        //<<<<----------Binary Tree Khud Ka Implementation with Testing------------->>>>>>>>>>
        MyTree t=new MyTree();
        t.insert(7);
        t.insert(8);
        t.insert(9);
        t.insert(5);
        t.insert(6);
        t.insert(4);
        System.out.println(t.find(4));
        System.out.println(t.find(11));
        t.PreOrder();

    }
}
