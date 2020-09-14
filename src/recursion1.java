import java.util.Scanner;

public class recursion1 {
    public recursion1() {
        Scanner sc =new Scanner(System.in);
        String line=sc.nextLine();
        String[] str=line.split(",",-1);
        int []arr=new int[str.length];
        for(int i=0; i<str.length;i++)
        {   arr[i]=Integer.parseInt(str[i]);
            System.out.println("Sum Of "+arr[i]+" Nmbers is "+recurs(arr[i]));
            System.out.println("Factorial Of "+arr[i]+" is "+recursfact(arr[i]));
        }

        String string=sc.nextLine();
       // power
    }

    private int recurs(int num)
    {
        if(num==1)
        {return 1;}
        else{
           return num+recurs(num-1);}
    }
    private int recursfact(int num)
    {
        if(num==0)
        {return 1;}
        else{
            return num*recursfact(num-1);}
    }
    private void powerset(String str,String curr,int index){
    if (index==str.length()){

    }
    curr=Character.toString(str.charAt(index))+",";
    powerset(str,curr,index+1);
    }
}
