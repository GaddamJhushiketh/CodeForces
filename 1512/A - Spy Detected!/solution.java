import java.util.Scanner;
public class SpyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] a = new int[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
 
            int normal;
 
            if (a[0] == a[1]) {
                normal = a[0];
            } else if (a[0] == a[2]) {
                normal = a[0];
            } else {
                normal = a[1];
            }
 
            for (int i = 0; i < n; i++) {
                if (a[i] != normal) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}