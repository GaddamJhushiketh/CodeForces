import java.util.*;
public class Lanterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        double maxGap =0;
        for(int i=1;i<n;i++){
            maxGap = Math.max(maxGap,a[i]-a[i-1]);
        }
        double ans = Math.max(a[0],l-a[n-1]);
        ans = Math.max(ans, maxGap / 2.0);
        System.out.println(ans);
    }
}