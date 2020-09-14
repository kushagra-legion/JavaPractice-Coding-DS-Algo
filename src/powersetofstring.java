import java.util.HashSet;
import java.util.Scanner;

public class powersetofstring {
    String line;
    public powersetofstring() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<String> set=new HashSet<String>();
        set.add(Character.toString(str.charAt(str.length()-1)));
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                StringBuffer stbuf=new StringBuffer();
                stbuf.append(str.charAt(i));
                set.add(stbuf.toString());
                stbuf.append(str.charAt(j));
                String tem1=stbuf.toString();
                for(int k=j;k<str.length();k++)
                {
                    String temp=tem1+str.substring(j+1,k+1);
                    set.add(temp);
                }
            }

        }
        System.out.println(set);
    }
//https://www.baeldung.com/java-power-set-of-a-set
    public powersetofstring(String line) {
        this.line = line;
        String [] arr=line.split(",",-2);
       // System.out.println();
        for(int i=0;i<arr.length;i++)
        {

        }
       // String str=sc.nextLine();
        HashSet<String> set=new HashSet<String>();
        set.add(arr[arr.length-1]);
       // System.out.println(set);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                StringBuffer stbuf=new StringBuffer();
                stbuf.append(arr[i]);
                set.add(stbuf.toString());
                stbuf.append(":"+arr[j]);
                String tem1=stbuf.toString();
                for(int k=j;k<arr.length;k++)
                {   int o=j+1;
                    String part=stbuf.toString();
                    while(o<=k)
                     {  //System.out.println(part);
                         part=part+":"+arr[o];
                         o++;
                     }
                    //String temp=tem1+str.substring(j+1,k+1);
                    set.add(part);
                }
            }

        }
      System.out.println(set);

    }
}
