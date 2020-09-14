import java.util.Scanner;

public class Goodhippoproblem {
    public Goodhippoproblem() {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[2];
        arr[0]=sc.nextInt();arr[1]=sc.nextInt();
        String [] check=new String[arr[0]];
        String [] values=new String[arr[1]];
        for(int i=0;i<arr[0];i++){
            sc.nextLine();
            check[i]=sc.nextLine();
            System.out.print("\n kush"+check[i]);
        }
        for(int i=0;i<arr[1];i++){
            sc.nextLine();
            values[i]=sc.nextLine();
        }
        for(int i=0;i<values.length;i++){
            int flag=0;
            for(int j=0;j<check.length;j++)
            {   if (values[i].contains(check[j])||values[i].length()==Integer.parseInt(check[j])){
                   flag=1;
                   break;
              }
            }
            if (flag==1)
            {System.out.println("GOOD");
             System.out.println(check[0]+""+check[1]);}
            else{System.out.println("BAD");}
        }
    }
}
/*2
4
47
744
7444
447
7774
77777777777777777777777777777777777777777777774


 */