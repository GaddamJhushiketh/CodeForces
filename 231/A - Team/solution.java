import java.util.Scanner;
 
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v =0;
        for(int i =0;i<n;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int count =0;
            if(a==1)
            count++;
            if(b==1)
            count++;
            if(c==1)
            count++;
            if(count>=2)
            {
                v++;
            }
        }
        System.out.println(v);
    }
}