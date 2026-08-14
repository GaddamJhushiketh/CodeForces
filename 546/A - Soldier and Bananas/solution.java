import java.util.*;
public class Solider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long n = sc.nextInt();
        int w = sc.nextInt();
        long val =0;
        for(int i =1;i<=w;i++)
        {
            val = val+(i*k);
        }
        if(val>=n)
        System.out.println(val-n);
        else
        System.out.print(0);
    }
}