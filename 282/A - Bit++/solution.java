import java.util.Scanner;
 
public class Bit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X =0;
        int n = sc.nextInt();
        sc.nextLine(); 
        for(int i=0;i<n;i++)
        {
            String str = sc.nextLine();
            if(str.contains("++"))
            {
                X++;
            }
            else
            {
                X--;
            }
        }
        System.out.println(X);
    }
}