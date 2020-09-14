import java.util.Scanner;

public class inttobinary {

    public inttobinary() {
        System.out.println("Enter the number in decimal to be converted into binary");
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        String str=Long.toBinaryString(num);
        System.out.println(str);
    /*    String s="";
        while(num>=1)
        {
            s=s+String.valueOf(num % 2);
            num=num/2;
        }

        char []arr=s.toCharArray();
        String k="";
        for(int j=s.length()-1;j>=0;j--)
        {  k+=arr[j];
        }

        System.out.println(k);

     */
    }
}
