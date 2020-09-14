import java.util.Scanner;

public class palindrome {
        public palindrome()
    {   System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        Integer size=sc.nextInt();
        int [] ar =new int[size];
        for(int i=0;i<size;i++)
        {
            ar[i]=sc.nextInt();
            //System.out.println(ar[i]);
        }


        int flag=-1;

       for(int i=0,j=ar.length-1; i<ar.length/2;i++,j--)
       {
           if (ar[i]==ar[j]){
               flag=1;
           }
           else {
               System.out.println("No");
           break;
           }
       }
       if(flag==1){
           System.out.println("Yes");
       }

    }

}
