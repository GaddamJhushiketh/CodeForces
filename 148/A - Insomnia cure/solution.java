import java.util.*;
public class Insomnia{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i=1;i<=b;i++){
            if (i%k == 0 || i%l == 0 || i%m == 0 || i%n == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}