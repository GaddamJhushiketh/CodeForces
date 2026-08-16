import java.util.*;
public class Magic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean hasEven = false, hasOdd = false;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0) hasEven = true;
                else hasOdd = true;
            }
            if (hasEven && hasOdd) {
                Arrays.sort(arr);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]);
                if (i < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}