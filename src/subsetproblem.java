import java.util.HashSet;
import java.util.Scanner;
public class subsetproblem {
    public subsetproblem() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<String> set=new HashSet<String>();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                set.add(str.substring(i,j+1));
            }
        }
        System.out.println(set);
    }
}
