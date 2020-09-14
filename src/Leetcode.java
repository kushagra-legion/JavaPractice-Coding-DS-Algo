import java.util.HashMap;
import java.util.Scanner;

public class Leetcode {
    public Leetcode() {
        Scanner sc=new Scanner(System.in);
        String line =sc.nextLine();

      //  map.put(0,line.charAt(0));
        int ans=1;
        for(int i=1;i<line.length();i++)
        {  HashMap<Integer,Character> map=new HashMap<>();
            int temp=0;
            for(int j=i;j<line.length();j++) {

            if (map.containsValue(line.charAt(j))) {
                if(temp>ans)
                {
                    ans=temp;
                }
                break;
            } else {
                map.put(j,line.charAt(j));
                temp++;
                if(temp>ans)
                {
                    ans=temp;
                }
            }
                     }
        }
        System.out.println(ans);
    }
}
