import java.util.*;
public class BuildAq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long low = 0;
            long high = (long) 1e18; 
            while (low < high) {
                long mid = (low + high + 1) / 2;
                long water = 0;
                for (long a : arr) {
                    if (a < mid) {
                        water += (mid - a);
                        if (water > x) break; 
                    }
                }
                if (water <= x)
                    low = mid;
                else
                    high = mid - 1;
            }
 
            System.out.println(low);
        }
        sc.close();
    }
}