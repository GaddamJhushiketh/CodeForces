import java.util.*;
public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double p = sc.nextDouble();
            sum += p;
        }
        double result = sum / n;
        System.out.println(result);
    }
}