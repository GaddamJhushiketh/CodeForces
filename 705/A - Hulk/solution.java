import java.util.*;
public class HulkFeelings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i % 2 == 1 ? "I hate" : "I love");
            if (i == n) sb.append(" it");
            else sb.append(" that ");
        }
        System.out.println(sb.toString());
    }
}