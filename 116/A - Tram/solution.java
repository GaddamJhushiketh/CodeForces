import java.util.*;
public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 0;
        int capacity = 0;
        for (int i = 0; i < n; i++){
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 
            current -= a;
            current += b;
            if (current > capacity) {
                capacity = current;
            }
        }
        System.out.println(capacity);
    }
}