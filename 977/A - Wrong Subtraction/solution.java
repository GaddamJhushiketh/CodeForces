import java.util.*;
public class WrongSubtraction
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        while(k-->0)
        {
            if(n%10 == 0)
            {
                n/=10;
            }
            else
            {
                n--;
            }
        }
        System.out.print(n);
    }
}