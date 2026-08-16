import java.util.Scanner;
 
public class EatingGame{
    public static int possibleWinners(int[] a) {
        int max = 0;
        for (int x : a) {
            max = Math.max(max, x);
        }
        int ans = 0;
        for (int x : a) {
            if (x == max) ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int ans = possibleWinners(a);
            System.out.println(ans);
        }
    }
}