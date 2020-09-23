import java.util.Scanner;

public class ProblemDaffo {
    //heloo

    public ProblemDaffo() {
        Scanner s=new Scanner(System.in);
        String ik=s.nextLine();
        String [] in=ik.split(" ");
        int []ar=new int[in.length];
        for(int i=0;i<in.length;i++)
        {
            ar[i]=Integer.valueOf(in[i]);
        }
        //
        int max=ar[0];
        int temp=0;
        for(int i=1;i<ar.length-1;i++) {
            if (max > ar[i]) {
                max=ar[i];
                if (ar[i - 1] > ar[i] && ar[i] > ar[i + 1]) {
                    for (int j = i + 1; j < ar.length - 1; j++) {
                        if (ar[j] > ar[j + 1]) {
                            if (j == ar.length - 1) {
                                System.out.println(1);
                                 temp++;
                            }
                        }
                    }
                    if(temp==1)
                    { break;}
                }
            }
            else{
                System.out.println(0);
                break;
            }
        }

    }
}


