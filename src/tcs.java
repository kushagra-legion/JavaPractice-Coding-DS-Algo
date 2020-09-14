import java.util.Scanner;

public class tcs {
    public tcs() {
        //System.out.println("Hello World!");
        Scanner sc =new Scanner(System.in);
        Integer line=sc.nextInt();
        Integer line1=sc.nextInt();
      //  String [] num=line.split("");
        Integer R=line;
        Integer N=line1;
     /*   for(int i=0;i<num.length;i++)
        { R=Integer.parseInt(num[0]);
            N=Integer.parseInt(num[1]);
        }

      */

        int ans=0;
        if(N%R==0)
        {ans=N/R;}
        else {
            int rmin=(int) N/R;
            int rmax=rmin+1;
            if(rmin==1){ans=(1+(rmin*rmax));}
            else{ans=(1+(rmax*rmin)+rmax);}
        }
        System.out.println(ans);
        System.out.println(R);
        System.out.println(N);
        R=N^R;
        N=N^R;
        R=R^N;
        System.out.println(R);
        System.out.println(N);
    }



}
