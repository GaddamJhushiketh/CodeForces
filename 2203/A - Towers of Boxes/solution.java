import java.util.*;
 
public class Towers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long m = sc.nextLong();
            long d = sc.nextLong();
            long maxHeight = d / m + 1;
            long towers = (n + maxHeight - 1) / maxHeight; 
            System.out.println(towers);
        }
    }
}