import java.util.Scanner;
 
public class EasyProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c =0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            if(x==1)
            c++;
        }
        if(c!=0)
        System.out.println("HARD");
        else
        System.out.println("EASY");
    }
}