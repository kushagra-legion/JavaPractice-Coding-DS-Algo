
import java.util.Scanner;

public class StackProblem {
    public StackProblem() {
        System.out.println("Enter the size of the Test Array");
        Scanner sc=new Scanner(System.in);
        Integer size=sc.nextInt();
        int [] ar =new int[size];
        for(int i=0;i<size;i++)
        {
            ar[i]=sc.nextInt();
            //System.out.println(ar[i]);
        }

        String answer=checker(ar);
        System.out.println("Answer-->"+answer);

    }
     public  String checker(int [] ar)
     {   MyStack stack =new MyStack();
         for (int i=0;i<ar.length;i++)
         {
            if(i<(ar.length/2))
            {
               //add the element without thinking
                stack.insert(String.valueOf(ar[i]));
            }
            else {
            if(Integer.parseInt(stack.getTopofStack())==ar[i]){
                stack.pop();
            }
            else {
                return "No";
            }

            }

         }

         if(stack.isEmpty())
         {
             return  "Yes";
         }
         else return "No";

     }

}
//  https://meet.google.com/tvt-yhhx-xmd
/*
    int i=-1;
    Iterator<Long> it=arr.iterator();
    long count=0;
    while(it.hasNext())
    {
        i++;
        Iterator<Long> it1=arr.iterator();
        Long check =it.next();
        int k=-1;
        while(it1.hasNext())
        {
          k++;
          if((check*r)==it1.next())
          {
            Iterator<Long> it2=arr.iterator();
            int n=-1;
            while(it2.hasNext())
            {
                 n++;
                 if((check*r*r)==it2.next())
                 {
                     count++;
                 }
            }

          }
        }
    }
  return count;

        */