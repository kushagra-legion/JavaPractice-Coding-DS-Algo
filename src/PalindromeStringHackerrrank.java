import java.util.Scanner;

public class PalindromeStringHackerrrank {

    // Complete the palindromeIndex function below.
    private int palindromeIndex(String s) {
        int count=0;
        int n=s.length();
        StringBuffer str=new StringBuffer(s);
        System.out.println("1");
        for(int i=0;i<n;i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("2");
                if (i == (n - 1 - i)) {
                    System.out.println("3");
                    return -1;
                } else {
                    int j = n - 1 - i;
                    System.out.println("4");
                    while (j < n - 1) {
                        System.out.println("5");
                        str.setCharAt(j, s.charAt(j + 1));
                        System.out.println("6");
                        j++;
                    }
                    n--;
                    count++;
                }
                System.out.println("7");
            }
        }
        if(count==0)
        {return 0;}
        else{return count;}

    }


    public PalindromeStringHackerrrank() {
        System.out.println("Enter the String to be checked...");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int ans=palindromeIndex(str);
        System.out.println("ans");
        System.out.println(ans);
    }
}
